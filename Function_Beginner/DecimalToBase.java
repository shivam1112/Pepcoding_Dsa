package function;

import java.util.Scanner;

public class DecimalToBase {
	
	public static int binary(int n,int b) {
		int answer=0;
		int j=1;
		while(n!=0) {
			answer=(n%b)*j+answer;
			n=n/b;
			j=j*10;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		int answer=binary(n,b);
		System.out.println(answer);
		sc.close();

	}

}
