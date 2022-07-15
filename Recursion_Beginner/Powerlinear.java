package Recursion;

import java.util.Scanner;

public class Powerlinear {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(power(x,n));
		sc.close();
	}

	public static int power(int x, int n) {
		int a=1;
		if(n==0) {
			return a;
		}
		a=x*power(x,n-1);
		return a;
	}

}
