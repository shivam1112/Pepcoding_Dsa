package StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==')') {
				if(st.size()==0){
					System.out.println(false);
					return;
				}
				while(st.peek()!='(') {
					if(st.peek()=='['||st.peek()=='{') {
						System.out.println(false);
						return;
					}
					st.pop();
				}
				st.pop();
			}else if(s.charAt(i)==']') {
				if(st.size()==0){
					System.out.println(false);
					return;
				}
				while(st.peek()!='[') {
					if(st.peek()=='('||st.peek()=='{') {
						System.out.println(false);
						return;
					}
					st.pop();
				}
				st.pop();
			}else if(s.charAt(i)=='}') {
				if(st.size()==0){
					System.out.println(false);
					return;
				}
				while(st.peek()!='{') {
					if(st.peek()=='['||st.peek()=='(') {
						System.out.println(false);
						return;
					}
					st.pop();
				}
				st.pop();
			}else {
				st.push(s.charAt(i));
			}
		}
		if(st.size()!=0){
			while(st.size()!=0){
				if(st.peek()=='('||st.peek()=='['||st.peek()=='{'){
					System.out.println(false);
					return;
				}
				st.pop();
			}
		}
		System.out.println(true);		
	}

}
