package function;

import java.util.Scanner;

public class Frequency {
	
	public static int frequency(int n,int d) {
		int ans=0;
		for(;n!=0;n=n/10) {
			if(n%10==d) {
				ans++;
			}
	
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int answer= frequency(n,d);
		System.out.println(answer);
		sc.close();

	}

}
