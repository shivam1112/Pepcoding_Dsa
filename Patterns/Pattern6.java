package patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int nsp=n/2;
		int nst=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nsp;j++) {
				System.out.print("\t");
			}
			for(int k=1;k<=nst;k++) {
				System.out.print("*\t");
			}
			if(i<=n/2) {
				nsp=nsp-1;
				nst=nst+2;
			}
			else{
				nsp=nsp+1;
				nst=nst-2;
			}
			System.out.println();
		}
		sc.close();

	}

}
