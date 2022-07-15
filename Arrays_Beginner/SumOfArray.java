package arrays;

import java.util.Scanner;

public class SumOfArray {
	public static int[] add(int n1,int n2,int []a1,int []a2) {
		int[]sum;
		sum=new int[Math.max(n1, n2)+1];
		int carry=0;
		int i=a1.length-1;
		int j=a2.length-1;
		for(int k=sum.length-1;k>=0;k--) {
			int add=carry;
			if(i>=0) {
				add+=a1[i];
			}
			if(j>=0) {
				add+=a2[j];
			}
			carry=add/10;
			i--;
			j--;
			int rem=add%10;
			sum[k]=rem;
			}
		int []arr;
			if(sum[0]==0) {
				arr=new int[sum.length-1];
				for(int l=0;l<sum.length-1;l++) {
					arr[l]=sum[l+1];
				}
			}
			else {
				arr=new int[sum.length];
				for(int l=0;l<sum.length;l++) {
					arr[l]=sum[l];
				}
		}
		
		return arr;
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
		int []arr=add(n1,n2,a1,a2);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
