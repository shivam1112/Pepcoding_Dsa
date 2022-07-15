package patterns;

import java.util.Scanner;

public class FibbonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=1;
		int c;
		System.out.print("Enter number of Fibboncci =");
		int t =sc.nextInt();
		for(int i=0;i<t;i++) {
			c=a+b;
			System.out.print(a+" ,");
			a=b;
			b=c;
		}
		sc.close();

	} 

}
