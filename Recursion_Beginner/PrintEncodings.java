package Recursion;

import java.util.Scanner;

public class PrintEncodings {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		printEncodings(s,"");
		sc.close();

	}

	public static void printEncodings(String str, String asf) {
		if (str.length()==0){
			System.out.println(asf);
			return;
		}else if(str.length()==1) {
			char ch =str.charAt(0);
			if(ch=='0') {
				return;
			}else {
				String chl =str.substring(1);
				char chf = (char) (Character.getNumericValue(ch)-1+'a');
				printEncodings(chl,asf+chf);
			}
		}else {
			char ch =str.charAt(0);
			if(ch=='0') {
				return;
			}else {
				String chl =str.substring(1);
				char chf = (char) (Character.getNumericValue(ch)-1+'a');
				printEncodings(chl,asf+chf);
			}
			char ch1 = (char) (Integer.parseInt(str.substring(0,2))-1+'a');
			String ch1l =str.substring(2);
			printEncodings(ch1l,asf+ch1);
		}
		
	}

}
