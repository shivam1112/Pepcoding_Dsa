package patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int nsp=1;
		int nst=n/2+1;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=nst;j++) {
				System.out.print("*\t");
			}
			for(int k=1;k<=nsp;k++) {
				System.out.print("\t");
			}
			for(int j=1;j<=nst;j++) {
				System.out.print("*\t");
			}
			
			if(i<=n/2) {
				nsp=nsp+2;
				nst=nst-1;
			}
			else {
				nsp=nsp-2;
				nst=nst+1;
			}
			System.out.println();
		}
		sc.close();

	}

}
