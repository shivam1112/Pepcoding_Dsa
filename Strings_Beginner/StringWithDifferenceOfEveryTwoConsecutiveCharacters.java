package strings;

import java.util.Scanner;

public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {

	public static String solution(String str){
		StringBuilder sb= new StringBuilder(str);
		int numi=1;
		for(int i=0;i<str.length()-1;i++) {
			String num=Integer.toString(str.charAt(i+1)-str.charAt(i));
			sb.insert(numi, num);
			numi+=num.length()+1;
			
		}
		str=sb.toString();
		return str;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
		scn.close();
	}

}
