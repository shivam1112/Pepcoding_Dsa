package StacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixConversions {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String exp = br.readLine();

	    Stack <String> pre = new Stack <>();
	    Stack <String> post = new Stack<>();
	    Stack <Character> op = new Stack<>();
	    
	    for(int i=0;i<exp.length();i++) {
	    	char ch = exp.charAt(i);
	    	if(isOperator(ch)) {
	    		if(op.size()==0 || ch=='(' || priority(ch)>priority(op.peek())) {
	    			op.push(ch);
	    		}else if(ch==')') {
	    			while(op.peek()!='(') {
	    				String pre2=pre.pop();
	    				String pre1=pre.pop();
	    				String post2=post.pop();
	    				String post1=post.pop();
	    				char opc=op.pop();
	    				String pref=pre1+pre2+opc;
	    				String postf=opc+post1+post2;
	    				pre.push(pref);
	    				post.push(postf);
	    			}
	    			op.pop();
	    		}else {
	    			while(op.size()>0 && priority(op.peek())>=priority(ch)) {
	    				String pre2=pre.pop();
	    				String pre1=pre.pop();
	    				String post2=post.pop();
	    				String post1=post.pop();
	    				char opc=op.pop();
	    				String pref=pre1+pre2+opc;
	    				String postf=opc+post1+post2;
	    				pre.push(pref);
	    				post.push(postf);
	    			}
	    			op.push(ch);
	    		}
	    	}else {
	    		pre.push(Character.toString(ch));
	    		post.push(Character.toString(ch));
	    	}
	    }
	 while(op.size()>0) {
		 String pre2=pre.pop();
		 String pre1=pre.pop();
		 String post2=post.pop();
		 String post1=post.pop();
		 char opc=op.pop();
		 String pref=pre1+pre2+opc;
		 String postf=opc+post1+post2;
		 pre.push(pref);
		 post.push(postf);
	 }
	 System.out.println(pre.peek());
	 System.out.println(post.peek());
	}

	private static int priority(char ch) {
		if(ch=='(') {
			return 1;
		}else if(ch=='*'||ch=='/') {
			return 3;
		}else {
			return 2;
		}
		
	}

	public static boolean isOperator(char ch) {
		if(ch=='(' || ch==')' || ch=='+' || ch=='-' || ch=='*' || ch=='/') {
			return true;
		}else {
			return false;
		}
	}

}
