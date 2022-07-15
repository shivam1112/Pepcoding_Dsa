package arrays;

import java.util.Scanner;

public class FindIndexElement {
	
	public static int findElement(int[]arr,int d) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==d) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No Of Elements in array: ");
		int n =sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter "+i+" Element of array: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter number to check in array: ");
		int d=sc.nextInt();
		int index=findElement(arr,d);
		sc.close();
		System.out.println(index);
	}

}
