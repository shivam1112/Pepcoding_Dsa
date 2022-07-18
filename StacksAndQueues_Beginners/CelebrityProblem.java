package StacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class CelebrityProblem {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];

		for (int j = 0; j < n; j++) {
			String line = br.readLine();
			for (int k = 0; k < n; k++) {
				arr[j][k] = line.charAt(k) - '0';
			}
		}

		findCelebrity(arr);

	}

	public static void findCelebrity(int[][] arr) {
		// if a celebrity is there print it''s index (not position), if there is not then print "none"
		Stack <Integer> st =new Stack<>();
		for (int i=0;i<arr.length;i++) {
			st.push(i);
		}
		while(st.size()>1) {
			int a = st.pop();
			int b = st.pop();
			if(arr[a][b]==1) {
				st.push(b);
			}else {
				st.push(a);
			}
		}
		int c = st.pop();
		boolean b=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[c][i]==1) {
				b=false;
				break;
			}
			if(arr[i][c]==0 && i!=c) {
				b=false;
				break;
			}
		}
		if(b) {
			System.out.println(c);
		}else {
			System.out.println("none");
		}
	}

}
