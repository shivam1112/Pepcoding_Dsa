package patterns;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		int nsp=n/2;
		int nst=1;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=nsp;j++) {
				if(i==nsp+1) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}

			}
			for(int k=1;k<=nst;k++) {
				System.out.print("*\t");
			}
			if(i<=n/2) {
				nst++;
			}
			else {
				nst--;
			}
			System.out.println();
		}
		
		sc.close();

	}

}
