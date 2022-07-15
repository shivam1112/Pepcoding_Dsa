package TimeComplexity;

import java.util.Scanner;

public class RadixSort {
	
	public static void radixSort(int[] arr) {
		  int max = Integer.MIN_VALUE;
		  for(int i=0;i<arr.length;i++) {
			  max = Math.max(max, arr[i]);
		  }
		  int exp=1;
		  while(exp<=max) {
			  countSort(arr,exp);
			  exp*=10;
		  }
	}
	
	public static void countSort(int[] arr, int exp) {
	    int []arr1 = new int[10];
	    int[] arrc = new int[arr.length];
	    for(int i=0;i<arr.length;i++){
	      arr1[arr[i]/exp%10]++;
	    }
	    for(int i=1;i<arr1.length;i++){
	      arr1[i]+=arr1[i-1];
	    }
	    for(int i=arr.length-1;i>=0;i--){
	      arrc[arr1[arr[i]/exp%10]-1]=arr[i];
	      arr1[arr[i]/exp%10]--;
	    }
	    for(int f=0;f<arr.length;f++) {
			arr[f]=arrc[f];
		}
		System.out.print("After sorting on " + exp + " place -> ");
		print(arr);
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	    	arr[i] = scn.nextInt();
	    }
	    radixSort(arr);
	    print(arr);
		scn.close();
	}

}
