package Recursion;

import java.util.Scanner;

public class LastIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(lastIndex(arr,n,x));
		sc.close();

	}

	public static int lastIndex(int[] arr, int idx, int x) {
		if(idx==1) {
			return -1;
		}
		if(x==arr[idx-1]) {
			return idx-1;
		}
		else {
			return lastIndex(arr,idx-1,x);
		}
	}

}
