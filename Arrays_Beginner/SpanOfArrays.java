package arrays;

import java.util.Scanner;

public class SpanOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		int def=max-min;
		System.out.println(def);
		sc.close();
	}

}
