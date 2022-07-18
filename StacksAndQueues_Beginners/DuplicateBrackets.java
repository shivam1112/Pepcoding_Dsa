package StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		Stack <Character> st = new Stack<>();
		boolean isdubl=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=')') {
				st.push(s.charAt(i));
			}else {
				if(st.peek()=='(') {
					isdubl= true;
					break;
				}else {
					while(st.peek()!='(') {
						st.pop();
					}
					st.pop();
				}
			}
		}
		System.out.println(isdubl); 
	}
}
