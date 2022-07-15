package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathWithJumps {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<String> al = getMazePaths(1,1,n,m);
		System.out.println(al);
		sc.close();

	}

	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		if(sr==dr && sc==dc) {
			ArrayList<String> all = new ArrayList<String>();
			all.add("");
			return all;
		}
		ArrayList<String> alf = new ArrayList<String>();
		for(int i=1;i<=dc-sc;i++) {
			ArrayList<String> al1 = getMazePaths(sr,sc+i,dr,dc);
			for(String a:al1) {
				alf.add("h"+i+a);
				
			}
		}
		for(int i=1;i<=dr-sr;i++) {
			ArrayList<String> al2 = getMazePaths(sr+i,sc,dr,dc);
			for(String a:al2) {
				alf.add("v"+i+a);
				
			}
		}for(int i=1;i<=dc-sc && i<dr-sr;i++) {
			ArrayList<String> al3 = getMazePaths(sr+i,sc+i,dr,dc);
			for(String a:al3) {
				alf.add("d"+i+a);
				
			}
		}
		return alf;
	}

}
