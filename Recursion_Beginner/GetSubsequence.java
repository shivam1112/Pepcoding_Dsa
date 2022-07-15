package Recursion;

import java.util.ArrayList;

import java.util.Scanner;

public class GetSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		System.out.println(gss(str));
		sc.close();
	}

	public static ArrayList<String> gss(String str) {
		if(str.length()==0) {
			ArrayList<String> al2= new ArrayList<String>();
			al2.add("");
			return al2;
		}
		char ch = str.charAt(0);
		String str1 =str.substring(1);
		ArrayList<String> al=gss(str1);
		ArrayList<String> al1= new ArrayList<String>();
		for(String str2 :al) {
			al1.add(str2);
		}
		for(String str2 :al) {
			al1.add(ch+str2);
		}
		return al1;
	}

}
