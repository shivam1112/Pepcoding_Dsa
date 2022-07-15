package Recursion;

import java.util.Scanner;

public class PrintZigzag {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		pzz(n);
		sc.close();

	}

	public static void pzz(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n);
		pzz(n-1);
		if(n==0) {
			return;
		}
		System.out.print(n);
		pzz(n-1);
		if(n==0) {
			return;
		}
		System.out.print(n);
	}

}
