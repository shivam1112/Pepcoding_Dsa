package Recursion;

import java.util.Scanner;
import java.util.ArrayList;

public class GetMazePaths {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(getMazePaths(1,1,n,m));
		sc.close();
		
	}

	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		if(sr==dr && sc==dc) {
			ArrayList<String>alf = new ArrayList<String>();
			alf.add("");
			return alf;
		}
		ArrayList<String>al= new ArrayList<String>();
		if( sc<dc) {
			al = getMazePaths(sr,sc+1,dr,dc);
		}
		ArrayList<String>al1 = new ArrayList<String>();
		if( sr<dr) {
			al1 = getMazePaths(sr+1,sc,dr,dc);
		}
		
		
		ArrayList<String>alf = new ArrayList<String>();
		for(String a:al) {
			alf.add("h"+a);
		}
		for(String a:al1) {
			alf.add("v"+a);
		}
		return alf;
		
	}

}
