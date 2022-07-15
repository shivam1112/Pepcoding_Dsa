package function;

import java.util.Scanner;

public class AnyBaseSubtraction {
	
	public static int subtract(int n1,int n2,int b) {
		int answer=0;
		int bowrow=0;
		int pow=1;
		int sub=0;
		while(n1!=0) {
			int ldn1=n1%10;
			int ldn2=n2%10;
			n1/=10;
			n2/=10;
			if(ldn1<ldn2) {
				sub= ldn1-ldn2+b-bowrow;
				bowrow=1;
			}
			else {
				sub= ldn1-ldn2-bowrow;
				bowrow=0;
			}
			answer+=sub*pow;
			pow*=10;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int b=sc.nextInt();
		int answer=subtract(n1,n2,b);
		System.out.println(answer);
		sc.close();
	}

}
