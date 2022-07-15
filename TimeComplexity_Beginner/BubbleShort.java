package TimeComplexity;

import java.util.Scanner;

public class BubbleShort {

	  public static void bubbleSort(int[] arr) {
	    int l=arr.length;
	    for(int k=l;k>0;k--) {
	    	for (int i=1;i<l;i++) {
	    		if(isSmaller(arr,i,i-1)) {
	    			swap(arr,i,i-1);
	    		}
	    	}
	    	l--;
	    }
	    
	  }

	  // used for swapping ith and jth elements of array
	  public static void swap(int[] arr, int i, int j) {
	    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	  }

	  // return true if ith element is smaller than jth element
	  public static boolean isSmaller(int[] arr, int i, int j) {
	    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
	    if (arr[i] < arr[j]) {
	      return true;
	    } else {
	      return false;
	    }
	  }

	  public static void print(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	      System.out.println(arr[i]);
	    }
	  }


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }
	    bubbleSort(arr);
	    print(arr);
	    scn.close();

	}

}
