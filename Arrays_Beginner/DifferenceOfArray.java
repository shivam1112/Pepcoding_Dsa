package arrays;

import java.util.Scanner;

public class DifferenceOfArray {
	
	public static int[] sub(int n1,int n2, int []a1,int []a2) {
		int []answer= new int[n2];
		int i=n1-1;
		int j=n2-1;
		int k=n2-1;
		
		while(k>=0) {
			int a1v=i>=0? a1[i]:0;
			if(a2[j]<a1v) {
				a2[j]+=10;
				a2[j-1]-=1;
			}
			answer[k]=a2[j]-a1v;
			i--;
			j--;
			k--;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int a1[]=new int [n1];
		for(int i=0;i<n1;i++) {
			a1[i]=sc.nextInt();
		}
		int n2=sc.nextInt();
		int a2[]=new int [n2];
		for(int i=0;i<n2;i++) {
			a2[i]=sc.nextInt();
		}
		int []arr= sub(n1,n2,a1,a2);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		sc.close();

	}

}
