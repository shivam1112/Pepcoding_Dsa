package Recursion;

import java.util.Scanner;

public class DisplayArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		displayArr(arr,n);
		sc.close();

	}

	public static void displayArr(int[] arr, int idx) {
		if(idx==0) {
			return;
		}
		displayArr(arr,idx-1);
		System.out.println(arr[idx-1]);
		
	}

}
