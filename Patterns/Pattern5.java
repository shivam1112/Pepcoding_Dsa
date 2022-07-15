package patterns;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nsp=0;
		int nst=5;
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=nsp;j++) {
				System.out.print("\t");
			}
			for(int k=1;k<=nst;k++) {
				System.out.print("*\t");
			}
			nsp=nsp+1;
			nst=nst-1;
			System.out.println();
		}

	}

}
