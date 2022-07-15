package patterns;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nst=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=nst;j++) {
				System.out.print("*\t");
			}
			nst=nst+1;
			System.out.println();
		}
	}

}
