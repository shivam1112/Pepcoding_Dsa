package arrays;

import java.util.Scanner;

public class FindElement {

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
		int count=0;
		for(int i=0;i<n;i++) {
			if(d==arr[i]) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(count);
		}
		else {
			System.out.println("-1");
		}
		sc.close();
	}

}
