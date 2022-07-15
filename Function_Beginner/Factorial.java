package function;

public class Factorial {
	
	public static int factorial (int x) {
		int ans =1;
		for(int i=1;i<=x;i++) {
			ans=ans*i;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int r=3;
		int nf= factorial(n);
		int rf= factorial(r);
		int nmrf= factorial(n-r);
		System.out.println(nf/(rf*nmrf));

	}

}
