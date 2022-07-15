package Recursion;

import java.util.Scanner;

public class PrintPermutations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		printPermutations(s,"");
		sc.close();
	}
	
	public static void printPermutations(String str, String asf) {
		if(str.length()==0) {
			System.out.println(asf);
			return;
		}
		for(int i=0;i<str.length();i++) {
			 char ch = str.charAt(i);
		     String strl= str.substring(0,i);
		     String strr= str.substring(i+1);
		     
		     printPermutations(strl+strr,asf+ch);
		}
    }
}
