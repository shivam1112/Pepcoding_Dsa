package arrays;

import java.util.Scanner;

public class BrokenEconomy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				int arr[]= {0,5,9,11,12,16,18,26,27,36,59,70};
				int data =sc.nextInt();
				
				int left=0;
				int right=arr.length-1;
				int floor=-1;
				int ceil=-1;
				while(left<=right) {
					int mid=(left+right)/2;
					if(arr[mid]==data) {
						floor=arr[mid];
						ceil=arr[mid];
						break;
					}
					else if(arr[mid]<data) {
						floor=arr[mid];
						left=mid+1;
					}
					else {
						ceil=arr[mid];
						right=mid-1;
					}
				}
				System.out.println(floor+"\t"+ceil);
				sc.close();

	}

}
