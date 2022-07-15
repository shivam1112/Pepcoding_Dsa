package Recursion;

import java.util.Scanner;

public class FloodFill {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean [][]arr1 = new boolean[n][m];
        floodfill(arr, 0, 0, "",arr1);
        scn.close();

	}
	
	public static void floodfill(int[][] maze, int sr, int sc, String asf ,boolean[][] arr) {
		if(maze[0].length==sc||maze.length==sr||0>sr||0>sc||maze[sr][sc+1]==0||arr[sr][sc]==true) {
			return;
		}
	    if(sr==maze.length && sc==maze[0].length) {
	    	System.out.println(asf);
	    	return;
	    }
		arr[sr][sc]=true;
    	floodfill(maze,sr,sc+1,asf+'r',arr);
    	floodfill(maze,sr+1,sc,asf+'d',arr);
	  	floodfill(maze,sr-1,sc,asf+'t',arr);
	   	floodfill(maze,sr,sc-1,asf+'l',arr);
	   	arr[sr][sc]=false;

    }

}
