package TimeComplexity;

import java.util.Scanner;

public class PivotInSortedAndRotatedArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int pivot = findPivot(arr);
		System.out.println(pivot);
		scn.close();
	}

	public static int findPivot(int[] arr) {
		int i=0,j=arr.length-1;
		while(i<j) {
			int mid =(i+j)/2;
			if(arr[mid]<arr[j]) {
				j=mid;
			}else {
				i=mid+1;
			}
		}
		return arr[i];
	}

	}
