package function;

import java.util.Scanner;

public class AnyBaseMultiplication {
	
	public static int multiply(int n1,int d,int b) {
		int answer=0;
		int carry=0;
		int pow=1;
		while(n1!=0 || carry!=0) {
			int ldn1=n1%10;
			n1/=10;
			int prod=(ldn1*d)+carry;
			carry=prod/b;
			int rem=prod%b;
			answer+=rem*pow;
			pow*=10;
		}
		return answer;
	}
	public static int addition(int a1,int a2,int b) {
		int answer=0;
		int carry=0;
		int pow=1;
		while(a1!=0 || a2!=0 || carry!=0) {
			int lda1=a1%10;
			int lda2=a2%10;
			a1/=10;
			a2/=10;
			int sum=lda1+lda2+carry;
			carry=sum/b;
			int rem=sum%b;
			answer+=rem*pow;
			pow*=10;
		}
		return answer;
	}
	public static int result(int n1,int n2,int b) {
		int m=0;
		int a=0;
		int pow=1;
		while(n2!=0) {
			int ldn2=n2%10;
			n2/=10;
			m=multiply(n1,ldn2,b);
			a=addition(m*pow,a,b);
			pow*=10;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int b=sc.nextInt();
		int result=result(n1,n2,b);
		System.out.println(result);
		sc.close();
	}

}
