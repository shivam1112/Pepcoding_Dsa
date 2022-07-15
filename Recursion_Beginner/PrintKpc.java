package Recursion;

import java.util.Scanner;

public class PrintKpc {
	
	static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			String str =sc.nextLine();
			printKPC(str,"");
			sc.close();

	}

	public static void printKPC(String str, String asf) {
		if(str.length()==0) {
			System.out.println(asf);
			return;
		}
		char ch = str.charAt(0);
		String s = str.substring(1);
		String chs =codes[Character.getNumericValue(ch)];
		String f =new String();
		for(int i=0;i<chs.length();i++) {
			f=chs.substring(i, i+1);
			printKPC(s,asf+f);
		}
	}

}
