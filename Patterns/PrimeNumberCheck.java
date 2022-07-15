package patterns;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int t=1;t<6;t++) {
			System.out.print("Enter "+t+" Number =");
			int n =sc.nextInt();
			boolean isPrime = true;
			for (int i=2;i*i<=n;i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==true) {
				System.out.println("The number is Prime");
			}
			else {
				System.out.println("The number is not prime");
			}
		}
		sc.close();
		
	}

}
