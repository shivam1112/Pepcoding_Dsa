package Recursion;

import java.util.ArrayList;

import java.util.Scanner;

public class GetKpc {
	static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str =sc.nextLine();
		System.out.println(getKPC(str));
		sc.close();
		
	}

	public static ArrayList<String> getKPC(String str) {
		if(str.length()==0) {
			ArrayList<String> al1 = new ArrayList<String>();
			al1.add("");
			return al1;
		}
		int c =  Character.getNumericValue(str.charAt(0));
		String dvar = str.substring(1);
		ArrayList<String> al2=getKPC(dvar);
		ArrayList<String> al = new ArrayList<String>();
		for(String s :al2) {
			for(int i =0;i<codes[c].length();i++) {
				String q=Character.toString(codes[c].charAt(i))+s;
				al.add(q);
			}
		}
		return al;
	}

}
