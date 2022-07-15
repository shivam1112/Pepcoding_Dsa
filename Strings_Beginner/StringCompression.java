package strings;

import java.util.Scanner;

public class StringCompression {
	
	public static String compression1(String str){
		StringBuilder sb= new StringBuilder(str);
		for(int i=0;i<sb.length()-1;i++) {
			if(sb.charAt(i)==sb.charAt(i+1)) {
				sb.deleteCharAt(i+1);
				i--;
			}
		}
		str=sb.toString();
		return str;
	}

	public static String compression2(String str){
		StringBuilder sb= new StringBuilder(str);
		int count=1;
		for(int i=0;i<sb.length()-1;i++) {
			if(sb.charAt(i)==sb.charAt(i+1)) {
				count++;
				sb.deleteCharAt(i+1);
				i--;
			}
			else if(count!=1) {
				sb.insert(i+1, count);
				i++;
				count=1;
			}
		}
		if(count!=1) {
			sb.append(count);
		}
		str=sb.toString();
		return str;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
		scn.close();
	}

}
