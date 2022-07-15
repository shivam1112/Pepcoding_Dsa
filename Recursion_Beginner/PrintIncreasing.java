package Recursion;

import java.util.Scanner;

public class PrintIncreasing {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		printIncreasing(n);
		sc.close();
	}

	public static void printIncreasing(int n) {
		if(n>1) {
			printIncreasing(n-1);
		}
		System.out.println(n);
		
		
	}

}
