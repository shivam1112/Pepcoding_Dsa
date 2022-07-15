package Recursion;

import java.util.Scanner;

public class Powerlogarithmic {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(power(x,n));
		sc.close();
	}

	public static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		int b=power(x,n/2);
		int a= b*b;
		if(n%2==1) {
			a =a*x;
		}
		return a;
	}

	}
