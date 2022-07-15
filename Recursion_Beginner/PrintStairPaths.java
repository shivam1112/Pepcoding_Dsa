package Recursion;

import java.util.Scanner;

public class PrintStairPaths {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		printStairPaths(n,"");
		sc.close();

	}
	
	public static void printStairPaths(int n, String path) {
		if(n<1) {
			System.out.println(path);
			return;
		}
		if(n>0) {
			printStairPaths(n-1,path+'1');
		}
		if(n>1) {
			printStairPaths(n-2,path+'2');
		}
		if(n>2) {
			printStairPaths(n-3,path+'3');
		}
    }
}
