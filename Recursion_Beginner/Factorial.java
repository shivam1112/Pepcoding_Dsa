package Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
		sc.close();
	}

	public static int factorial(int n) {
		int a=1;
		if(n==1) {
			return a;
		}
		a=n*factorial(n-1);
		return a;
	}

}
