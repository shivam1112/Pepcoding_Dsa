package patterns;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int nst=n;
		int nsp=0;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=nsp;k++) {
				System.out.print("\t");
			}
			for(int j=1;j<=nst;j++) {
				if(i>=n/2+2 && i!=n && j!=1 && j!=nst) {
					System.out.print("\t");
				}
				else {
					System.out.print("*\t");
				}
			}
			if(i<=n/2) {
				nst=nst-2;
				nsp++;
			}
			else {
				
				nst=nst+2;
				nsp--;							
			}
			System.out.println();
		}
		sc.close();

	}

}
