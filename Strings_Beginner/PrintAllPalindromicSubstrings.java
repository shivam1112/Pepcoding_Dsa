package strings;

import java.util.Scanner;

public class PrintAllPalindromicSubstrings {
	public static void solution(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				if(pelindrome(str.substring(i, j+1))==true) {
					System.out.println(str.substring(i, j+1));
				}
			}
		}
	}
	public static boolean pelindrome(String str) {
		int l=0;
		int r=str.length()-1;
		while(l<r) {
			if(str.charAt(l)==str.charAt(r)) {
				l++;
				r--;
			}
			else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
		scn.close();

	}

}
