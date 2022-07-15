package arrays;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int l=a.length-1;
		for(int i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[l];
			a[l]=temp;
			l--;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		sc.close();

	}

}
