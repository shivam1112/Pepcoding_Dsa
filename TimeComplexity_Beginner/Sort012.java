package TimeComplexity;

import java.util.Scanner;

public class Sort012 {

	public static void sort012(int[] arr){
		int i=0;
		int i1=0;
		int j=arr.length-1;
		int j1=arr.length-1;
		while(i<arr.length) {
			if(arr[i]==0) {
				swap(arr,i,i1);
				i++;
				i1++;
			}else {
				i++;
			}
			if(arr[j]==2) {
				swap(arr,j,j1);
				j--;
				j1--;
			}else {
				j--;
			}
		}
		
	}

	// used for swapping ith and jth elements of array
	public static void swap(int[] arr, int i, int j) {
		System.out.println("Swapping index " + i + " and index " + j);
		int temp = arr[i];
		arr[i] = arr[j];
	    arr[j] = temp;
	}

	public static void print(int[] arr){
		for(int i = 0 ; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0 ;i < n; i++){
	      arr[i] = scn.nextInt();
	    }
	    sort012(arr);
	    print(arr);
	    scn.close();
	}

}
