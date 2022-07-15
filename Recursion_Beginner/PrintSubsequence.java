package Recursion;

import java.util.Scanner;

public class PrintSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		printSS(str,"");
		sc.close();
	}
	
	public static void printSS(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String s = str.substring(1);
		printSS(s,ans+ch);
		printSS(s,ans);
		
    }

}
