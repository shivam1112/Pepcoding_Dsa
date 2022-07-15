package patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int nst = 1;
		int num = 1;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=nst;j++) {
				System.out.print(num+"\t");
				num = num+1;
			}
			System.out.println();
			nst =nst+1;			
		}
		sc.close();

	}

}
