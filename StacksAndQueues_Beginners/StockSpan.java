package StacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StockSpan {
	
	public static void display(int[] a){
		StringBuilder sb = new StringBuilder();

	    for(int val: a){
	    	sb.append(val + "\n");
	    }
	    System.out.println(sb);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	    	a[i] = Integer.parseInt(br.readLine());
	    }

	    int[] span = solve(a);
	    display(span);
	}
//	e.g.
//	for the array [2 5 9 3 1 12 6 8 7]
//	span for 2 is 1
//	span for 5 is 2
//	span for 9 is 3
//	span for 3 is 1
//	span for 1 is 1
//	span for 12 is 6
//	span for 6 is 1
//	span for 8 is 2
//	span for 7 is 1

	public static int[] solve(int[] arr){
		Stack <Integer> st = new Stack <>();
		st.push(0);
		int []ans=new int[arr.length];
		ans[0]=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[st.peek()]<=arr[i]) {
				while(st.size()>0 && arr[st.peek()]<=arr[i]) {
					st.pop();
				}
				if(st.size()==0) {
					ans[i]=i+1;
				}else {
					ans[i]=i-st.peek();
				}
				
			}else {
				ans[i]=1;
			}
			st.push(i);
		}
		return ans;
	}
}
