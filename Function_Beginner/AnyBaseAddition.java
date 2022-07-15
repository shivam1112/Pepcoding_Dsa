package function;

import java.util.Scanner;

public class AnyBaseAddition {
	
	public static int addtion(int n1,int n2,int b) {
		int c=0;
		int a=0;
		int pow=1;
		while(n1!=0 || n2!=0 || c!=0){
			int d=(n1%10)+(n2%10)+c;
			c=d/b;
			d=d%b;
			a=(d*pow)+a;
			pow=pow*10;
			n1=n1/10;
			n2=n2/10;
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int b=sc.nextInt();
		int answer=addtion(n1,n2,b);
		System.out.println(answer);
		sc.close();

	}

}
