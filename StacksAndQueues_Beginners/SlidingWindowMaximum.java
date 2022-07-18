package StacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SlidingWindowMaximum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }
	    int k = Integer.parseInt(br.readLine());

	    Stack<Integer> st= new Stack<>();
	    int []ng=new int[n];
	    ng[n-1]=n;
	    st.push(n-1);
	    for(int i=n-2;i>=0;i++) {
	    	while(st.size()>0 && a[st.peek()]<=a[i]) {
	    		st.pop();
	    	}
	    	if(st.size()==0) {
	    		ng[i]=n;
	    	}else {
	    		ng[i]=st.peek();
	    	}
	    	st.push(i);
	    }
	    int []ans = new int[n-k+1];
	    int j=0;
	    for(int i=0;i<=n-k;i++) {
	    	if(j<i) {
	    		j=i;
	    	}
	    	while(j<i+k) {
	    		j=ng[i];
	    	}
	    	ans[i]=a[j];
	    }
	}

}
