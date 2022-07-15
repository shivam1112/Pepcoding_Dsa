package arrays;

import java.util.Scanner;

public class RotateAnArray {

	public static int[] reverse(int[]arr,int i,int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		k=k%a.length;
		if(k<0) {
			k+=a.length;
		}
		a=reverse(a,0,a.length-k-1);
		a=reverse(a,a.length-k,a.length-1);
		a=reverse(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}

}
