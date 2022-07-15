package arrays;

import java.util.Scanner;

public class SubsetOfArray {
	
	public static int dtb(int n,int b) {
		int ans=0;
		int pow=1;
		int rem=0;
		while(n!=0) {
			rem=n%b;
			n/=b;
			ans+=rem*pow;
			pow*=10;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ts =(int)Math.pow(2,n);
		for(int i=0;i<ts;i++) {
			int binary=dtb(i,2);
			int div=(int)Math.pow(10,n-1);
			for(int j=0;j<n;j++) {
				int q=binary/div;
				int rem=binary%div;
				if(q==1) {
					System.out.print(arr[j]+"\t");
				}
				else {
					System.out.print("-\t");
				}
				div/=10;
				binary=rem;			}
			System.out.println();
		}
		sc.close();
	}

}
