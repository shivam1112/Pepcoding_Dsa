package strings;

import java.util.Scanner;

public class ToggleOpticaDocument {
	public static String toggleCase(String str) {
		StringBuilder sb= new StringBuilder(str);
		String upper =str.toUpperCase();
		String lower =str.toLowerCase();
		for(int i=0;i<sb.length();i++) {
			if(str.charAt(i)==upper.charAt(i)){
				sb.deleteCharAt(i);
				sb.insert(i, lower.charAt(i));
			}
			else {
				sb.deleteCharAt(i);
				sb.insert(i, upper.charAt(i));
			}
		}
		str=sb.toString();
		return str;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
		scn.close();
	}

}
