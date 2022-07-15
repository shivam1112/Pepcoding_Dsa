package patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int nst = 1;
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<n;i++) {
			for(int k=1;k<=nst;k++) {
				c=a+b;
				System.out.print(a+"\t");
				a=b;
				b=c;
			}
			System.out.println();
			nst =nst+1;	
		}
		
		sc.close();
	}

}
