package patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nsp=4;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=nsp;j++){
				System.out.print("\t");
			}
			System.out.println("*\t");
			nsp=nsp-1;
		}
		sc.close();

	}

}
