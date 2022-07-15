package function;

import java.util.Scanner;

public class AnyBaseToAnyBase {
	
	public static int base(int n,int b1,int b2) {
		int answer1=0;
		int pow=1;
		while(n!=0){
			answer1=n%10*pow+answer1;
			pow=pow*b1;
			n=n/10;
		}
		int answer=0;
		int pow1=1;
		while(answer1!=0) {
			answer=(answer1%b2)*pow1+answer;
			answer1=answer1/b2;
			pow1=pow1*10;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		int answer=base(n,b1,b2);
		System.out.println(answer);
		sc.close();
	}

}
