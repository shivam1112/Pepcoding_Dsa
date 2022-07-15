package Recursion;

import java.util.Scanner;
import java.util.ArrayList;

public class GetStairPaths {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println(getStairPaths(n));
		sc.close();
	}
	
	public static ArrayList<String> getStairPaths(int n){
		if(n==0) {
			ArrayList<String> al4 = new ArrayList<String>();
			al4.add("");
			return al4;
		}else if(n<0) {
			ArrayList<String> al4 = new ArrayList<String>();
			return al4;
		}
		ArrayList<String> al1 = getStairPaths(n-1);
		ArrayList<String> al2 = getStairPaths(n-2);
		ArrayList<String> al3 = getStairPaths(n-3);
		ArrayList<String> al = new ArrayList<String>();
		for(String s:al1) {
			al.add(1+s);
		}
		for(String s:al2) {
			al.add(2+s);
		}
		for(String s:al3) {
			al.add(3+s);
		}
		return al;
	}

}
