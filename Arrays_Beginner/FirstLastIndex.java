package arrays;

import java.util.Scanner;

public class FirstLastIndex {
	
	public static int first(int []arr,int data) {
		
		int left=0;
		int right=arr.length-1;
		int first=0;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==data) {
				first=mid;
				right=mid-1;
			}
			else if(arr[mid]<data) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
	}
		return first;
	}
public static int last(int []arr,int data) {
		
		int left=0;
		int right=arr.length-1;
		int last=0;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==data) {
				last=mid;
				left=mid+1;
			}
			else if(arr[mid]<data) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
	}
		return last;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {1, 5, 10, 15, 22, 33, 33, 33, 33, 33, 40, 42, 55, 66, 77};
		int data =sc.nextInt();
		int first=first(arr,data);
		int last=last(arr,data);
		System.out.println(first+"\t"+last);
		sc.close();

	}

}
