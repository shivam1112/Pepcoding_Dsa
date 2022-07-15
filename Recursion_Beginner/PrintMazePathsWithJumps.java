package Recursion;

import java.util.Scanner;

public class PrintMazePathsWithJumps {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		printMazePaths(1,1,n,m,"");
		sc.close();

	}

	private static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
		if(sr==dr && sc==dc) {
			System.out.println(psf);
			return;
		}

		for(int i=1;i<=dc-sc;i++) {
			printMazePaths(sr,sc+i,dr,dc,psf+"h"+Integer.toString(i));
		}

		for(int i=1;i<=dr-sr;i++) {
			printMazePaths(sr+i,sc,dr,dc,psf+"v"+Integer.toString(i));	
		}

		for(int i=1;i<=dc-sc && i<=dr-sr;i++) {
			printMazePaths(sr+i,sc+i,dr,dc,psf+"d"+Integer.toString(i));	
		}	
	
	}

}
