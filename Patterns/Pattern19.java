package patterns;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int nst=1;
		int nsp=(2*n)-3;
		int num=1;
		for (int i=1;i<=n;i++){
			for (int j=1;j<=nst;j++) {
				System.out.print(num+"\t");
				num++;
			}
			for (int k=1;k<=nsp;k++) {
				System.out.print(" \t");
			}
			if(i==n) {
				nst--;
				num--;
			}
			for (int j=1;j<=nst;j++) {
				num--;
				System.out.print(num+"\t");
			}
			nsp=nsp-2;
			nst++;
			System.out.println();
		}
		sc.close();

	}

}
