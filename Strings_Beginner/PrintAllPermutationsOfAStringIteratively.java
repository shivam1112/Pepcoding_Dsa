package strings;

import java.util.Scanner;

public class PrintAllPermutationsOfAStringIteratively {
	
	public static void solution(String str) {
		int len=str.length();
		int per=1;
		for(int i=len;i>=2;i--) {
			per*=i;
		}
		for(int i=0;i<per;i++) {
			StringBuilder s=new StringBuilder(str);
			int temp=i;
			for(int j=len;j>0;j--) {
				int r=temp%j;
				int q=temp/j;
				System.out.print(s.charAt(r));
				s.deleteCharAt(r);
				temp=q;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		solution(str);
		sc.close();

	}

}
