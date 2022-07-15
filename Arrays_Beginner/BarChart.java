package arrays;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		for(int i=1;i<=max;i++) {
			for(int j=0;j<n;j++) {
				if(arr[j]>(max-i)){
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
