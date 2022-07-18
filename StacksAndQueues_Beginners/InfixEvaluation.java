package StacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixEvaluation {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String exp = br.readLine();
	    Stack <Integer> num = new Stack<>();
	    Stack <Character> opr = new Stack<>();
	    for(int i=0;i<exp.length();i++) {
	    	char ch = exp.charAt(i);
	    	if(isOperator(ch)) {
	    		if(ch==')') {
	    			while(opr.peek()!='(') {
	    				char op=opr.pop();
	    				int num2=num.pop();
	    				int num1=num.pop();
	    				num.push(answer(num1,num2,op));
	    			}
	    			opr.pop();
	    		}else if(ch=='('||opr.size()==0) {
	    			opr.push(exp.charAt(i));
	    		}else if(precidence(ch)>precidence(opr.peek())) {
	    			opr.push(exp.charAt(i));
	    		}else {
	    			while(opr.size()>0 && precidence(ch)<=precidence(opr.peek())) {
	    				char op=opr.pop();
	    				int num2=num.pop();
	    				int num1=num.pop();
	    				num.push(answer(num1,num2,op));
	    			}
	    			opr.push(exp.charAt(i));
	    		}
	    	}else if(ch!=' '){
	    		num.push(Character.getNumericValue(exp.charAt(i)));
	    	}
	    }
	    while(opr.size()>0) {
	    	char op=opr.pop();
			int num2=num.pop();
			int num1=num.pop();
			num.push(answer(num1,num2,op));
	    }
	    System.out.println(num.peek());
	}
	public static int precidence(char ch) {
		if(ch=='(') {
			return 1;
		}else if(ch=='*'||ch=='/'){
			return 3;
		}else {
			return 2;
		}
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
