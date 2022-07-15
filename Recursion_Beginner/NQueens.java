package Recursion;

import java.util.Scanner;

public class NQueens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][]arr = new int[n][n];
		printNQueens(arr,"",0);
		sc.close();

	}
	
	public static void printNQueens(int[][] chess, String qsf, int row) {
		if(row==chess.length) {
			System.out.println(qsf+'.');
			return;
		}
		for(int col=0;col<chess.length;col++) {
			if(rulesIsFallowed(chess,col,row)==true) {
				chess[row][col]=1;
				printNQueens(chess,qsf+row+'-'+col+", ",row+1);
				chess[row][col]=0;
			}
			
		}
		
    }
	
	public static boolean rulesIsFallowed(int[][] chess, int col, int row){
		for(int i=row-1;i>=0;i--) {
			if(chess[i][col]==1) {
				return false;
			}
		}
		for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		for(int i=row-1, j=col+1; i>=0 && j<chess.length; i--, j++) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		return true;
	}
}
