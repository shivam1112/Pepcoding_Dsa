package TimeComplexity;

import java.util.Scanner;

public class CountSort {
	
	public static void countSort(int[] arr, int min, int max) {
		int []arrf=new int[max-min+1];
		for(int i=0;i<arr.length;i++) {
			arrf[arr[i]-min]++;
		}
		
		for(int k=1;k<arrf.length;k++) {
			arrf[k]+=arrf[k-1];
		}
		int []ans=new int[arr.length];
		for(int j=arr.length-1;j>=0;j--) {
			ans[arrf[arr[j]-min]-1]=arr[j];
			arrf[arr[j]-min]--;
		}
		for(int f=0;f<arr.length;f++) {
			arr[f]=ans[f];
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
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	      max = Math.max(max, arr[i]);
	      min = Math.min(min, arr[i]);
	    }
	    scn.close();
	    countSort(arr,min,max);
	    print(arr);

	}

}
