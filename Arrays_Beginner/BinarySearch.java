package arrays;

import java.util.Scanner;

public class BinarySearch {
	
	public static int find(int []arr,int d) {
		int left=0;
		int right=arr.length;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==d) {
				return mid;
			}
			else if(arr[mid]<d) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {0,5,9,11,12,16,18,26,27,36,59,70};
		int data =sc.nextInt();
		int answer=find(arr,data);
		System.out.println(answer);
		sc.close();
	}

}
