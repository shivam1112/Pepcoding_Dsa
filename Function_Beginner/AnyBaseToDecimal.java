package function;

import java.util.Scanner;

public class AnyBaseToDecimal {
	
	public static int decimal(int n,int b) {
		int answer=0;
		int pow=1;
		while(n!=0){
			answer=n%10*pow+answer;
			pow=pow*b;
			n=n/10;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		int answer=decimal(n,b);
		System.out.println(answer);
		sc.close();

	}

}
