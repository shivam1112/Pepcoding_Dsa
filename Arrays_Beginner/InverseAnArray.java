package arrays;

import java.util.Scanner;

public class InverseAnArray {
	
	public static int[] inverse(int []a){
		int []rev=new int[a.length];
		for(int k=0;k<a.length;k++) {
			int temp=a[k];
			rev[temp]=k;
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		a=inverse(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		sc.close();

	}

}
