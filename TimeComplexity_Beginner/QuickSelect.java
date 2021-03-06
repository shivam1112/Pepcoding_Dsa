package TimeComplexity;

import java.util.Scanner;

public class QuickSelect {
	public static int quickSelect(int[] arr, int lo, int hi, int k) {
	    int mid=partition(arr,arr[hi],lo,hi);
	    if(k==mid) {
	    	return arr[k];
	    }else if(mid<k) {
	    	return quickSelect(arr,mid+1,hi,k);
	    }else if(mid>k) {
	    	return quickSelect(arr,lo,mid-1,k);
	    }
	    return 0;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 int[] arr = new int[n];
		 for (int i = 0; i < n; i++) {
			 arr[i] = scn.nextInt();
		 }
		 int k = scn.nextInt();
		 System.out.println(quickSelect(arr,0,arr.length - 1,k - 1));
		 scn.close();
	}
	public static int partition(int[] arr, int pivot, int lo, int hi) {
	    System.out.println("pivot -> " + pivot);
	    int i = lo, j = lo;
	    while (i <= hi) {
	      if (arr[i] <= pivot) {
	        swap(arr, i, j);
	        i++;
	        j++;
	      } else {
	        i++;
	      }
	    }
	    System.out.println("pivot index -> " + (j - 1));
	    return (j - 1);
	 }

	  // used for swapping ith and jth elements of array
	 public static void swap(int[] arr, int i, int j) {
		 System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		 int temp = arr[i];
		 arr[i] = arr[j];
		 arr[j] = temp;
	 }

	 public static void print(int[] arr) {
		 for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }
		 System.out.println();
	 }

}
