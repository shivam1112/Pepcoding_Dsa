package StacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PrefixEvaluationAndConversions {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String exp = br.readLine();

	    Stack<Integer> num = new Stack<>();
	    Stack<String> inf = new Stack<>();
	    Stack<String> pre = new Stack<>();
	    for(int i=exp.length()-1;i>=0;i--) {
	    	char ch = exp.charAt(i);
	    	if(isOperator(ch)) {
	    		int num1 = num.pop();
	    		int num2 = num.pop();
	    		num.push(answer(num1,num2,ch));
	    		
	    		String inf1="("+inf.pop();
	    		String inf2=inf.pop()+")";
	    		inf.push(inf1+ch+inf2);
	    		
	    		String pre1=pre.pop();
	    		String pre2=pre.pop();
	    		pre.push(pre1+pre2+ch);
	    	}else {
	    		num.push(Character.getNumericValue(ch));
	    		inf.push(ch+"");
	    		pre.push(ch+"");
	    	}
	    }
	    System.out.println(num.peek());
	    System.out.println(inf.peek());
	    System.out.println(pre.peek());
	}
	
	public static boolean isOperator(char ch){
		if(ch=='('|| ch=='+'|| ch=='-'|| ch=='*'|| ch=='/' || ch==')') {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int answer(int num1 ,int num2, char op) {
		if(op == '*') {
			return num1 * num2;
		}else if(op == '/'){
			return num1 / num2;
		}else if(op == '+'){
			return num1 + num2;
		}else{
			return num1 - num2;
		}
	}

}
