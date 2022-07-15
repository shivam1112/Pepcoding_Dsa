package TimeComplexity;

import java.util.Scanner;

public class TargetSumPair1 {// -48 -37 -29 9 34 43 44 60 74 84 86 100 

	public static void targetSumPair(int[] arr, int target){
		arr=mergesort(arr,0,arr.length-1);
		int i=0,j=arr.length-1;
		while(i<=j) {
			if(arr[i]+arr[j]==target) {
				System.out.println(arr[i]+", "+arr[j]);
				i++;
				j--;
			}else if(arr[i]+arr[j]<target) {
				i++;
			}else if(arr[i]+arr[j]>target){
				j--;
			}
		}
	}

	public static int[] mergesort(int[] arr, int lo, int hi) {
		if(lo==hi) {
			int []ans=new int[1];
			ans[0]=arr[lo];
			return ans;
		}
		int mid = (lo+hi)/2;
		int []fsa = mergesort(arr,lo,mid);
		int []ssa = mergesort(arr,mid+1,hi);
		int []ans = mergeTwoSortedArrays(fsa,ssa);
		return ans;
	}

	public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
		int i=0,j=0,k=0;
		int []ans=new int[a.length+b.length];
		while(i<a.length && j<b.length) {
			if(a[i]<=b[j]) {
				ans[k]=a[i];
				k++;
				i++;
			}else {
				ans[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			ans[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			ans[k]=b[j];
			k++;
			j++;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0 ;i < n; i++){
	    	arr[i] = scn.nextInt();
	    }
	    int target = scn.nextInt();
	    targetSumPair(arr,target);
	    scn.close();
	}
	

}
