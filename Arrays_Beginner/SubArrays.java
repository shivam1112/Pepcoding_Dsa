package arrays;

import java.util.Scanner;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {	
			for(int k=0;k<n;k++) {
			for(int j=i;j<=k;j++) {
			
				System.out.print(a[j]+"\t");
				
			}
			System.out.println();
			}
			sc.close();			
		}
	}

}
