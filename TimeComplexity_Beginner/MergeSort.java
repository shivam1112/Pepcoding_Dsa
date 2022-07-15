package TimeComplexity;

import java.util.Scanner;

public class MergeSort {
	
	public static int[] mergeSort(int[] arr, int lo, int hi) {
		if(arr.length==1) {
			return arr;
		}
		int mid=0;
	    if(arr.length%2==0) {
	    	mid = (arr.length/2)-1;
	    }else {
	    	mid = arr.length/2;
	    }
	    int []arr1=new int[mid+1];
	    for(int i=lo;i<=mid;i++) {
    		arr1[i]=arr[i];
    	}
	    int []arr2=new int[arr.length-mid-1];
	    int j=arr2.length-1;
	    for(int i=hi;i>mid;i--) {
	    	arr2[j]=arr[i];
	    	j--;
	    }
	    int []arrf1=mergeSort(arr1,lo,mid);
	    int []arrf2=mergeSort(arr2,lo,arr2.length-1);
	    int []arrf=mergeTwoSortedArrays(arrf1,arrf2);
	    return arrf;
	  }

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }
	    int[] sa = mergeSort(arr,0,arr.length - 1);
	    System.out.print("Sorted Array -> ");
	    print(sa);
	    scn.close();

	}
	public static int[] mergeTwoSortedArrays(int[] a, int[] b){
	    System.out.println("Merging these two arrays ");
	    System.out.print("left array -> ");
	    print(a);
	    System.out.print("right array -> ");
	    print(b);
	    int i = 0, j =0, k = 0;
	    int[] ans = new int[a.length + b.length];
	    while(i < a.length && j < b.length){
	        if(a[i] <= b[j]){
	          ans[k] = a[i];
	          i++;
	          k++;
	        }else{
	          ans[k] = b[j];
	          j++;
	          k++;
	        }
	    }

	    while(i < a.length){
	      ans[k] = a[i];
	      k++;
	      i++;
	    }

	    while(j < b.length){
	      ans[k] = b[j];
	      k++;
	      j++;
	    }
	    
	    return ans;
	  }

	  public static void print(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	  }

}
