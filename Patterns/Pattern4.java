package patterns;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nst=1;
		int nsp=4;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=nsp;j++) {
				System.out.print("\t");
			}
			for(int k=1;k<=nst;k++) {
				System.out.print("*\t");	
			}
			nst=nst+1;
			nsp=nsp-1;
			System.out.println();
		}

	}

}
