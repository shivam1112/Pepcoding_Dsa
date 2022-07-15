package patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		int nst =1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nst;j++) {
				System.out.print(a+"\t");
				c=a+b;
				a=b;
				b=c;
			}
			nst=nst+1;
			System.out.println();			
		}
		sc.close();
		

	}

}
