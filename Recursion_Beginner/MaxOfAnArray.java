package Recursion;

import java.util.Scanner;

public class MaxOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(maxOfArray(arr,0));
		sc.close();

	}

	public static int maxOfArray(int[] arr, int idx) {
		if(idx==arr.length-1) {
			return arr[idx];
		}
		int misa = maxOfArray(arr,idx+1);
		if(misa<arr[idx]) {
			return arr[idx];
		}
		else {
			return misa;
		}
	}

}
