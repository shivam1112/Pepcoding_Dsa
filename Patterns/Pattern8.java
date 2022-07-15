package patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int nsp=0;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=nsp;j++) {
				System.out.print("\t");
			}
			System.out.println("*");
			nsp=nsp+1;
		}
		sc.close();
	}

}
