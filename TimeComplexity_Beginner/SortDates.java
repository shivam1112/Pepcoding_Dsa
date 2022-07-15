package TimeComplexity;

import java.util.Scanner;

public class SortDates {
		
	public static void sortDates(String[] arr) {
		
		countSort(arr,1000000,100,32);
		countSort(arr,10000,100,13);
		countSort(arr,1,10000,2501);
	}

	public static void countSort(String[] arr,int div, int mod, int range) {
		int []arr1 = new int[range];
		String[] arrc = new String[arr.length];
	    for(int i=0;i<arr.length;i++){
	      arr1[Integer.parseInt(arr[i],10)/div%mod]++;
	    }
	    for(int i=1;i<arr1.length;i++){
	      arr1[i]+=arr1[i-1];
	    }
	    for(int i=arr.length-1;i>=0;i--){
	      arrc[arr1[Integer.parseInt(arr[i],10)/div%mod]-1]=arr[i];
	      arr1[Integer.parseInt(arr[i],10)/div%mod]--;
	    }
	    for(int f=0;f<arr.length;f++) {
			arr[f]=arrc[f];
		}
		
	}

	public static void print(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    String[] arr = new String[n];
	    for (int i = 0; i < n; i++) {
	    	String str = scn.next();
	    	arr[i] = str;
	    }
	    sortDates(arr);
	    print(arr);
	    scn.close();
	}

}
