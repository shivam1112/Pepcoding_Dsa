package StacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class MinimumStackConstantSpace {
	
	  public static class MinStack {
	    Stack<Integer> data;
	    int min;

	    public MinStack() {
	      data = new Stack<>();
	    }

	    int size() {
	      return data.size();
	    }

	    void push(int val) {
	      if(data.size()==0){
	        data.push(val);
	        min = val;
	      }else if(min<=val){
	        data.push(val);
	      }else{
	        data.push(val+val-min);
	        min =val;
	      }
	    }

	    int pop() {
	      if(size()>0){
	        if(min<=data.peek()){
	          return data.pop();
	        }else{
	          int val = data.pop();
	          int mindub = min;
	          min = min + min -val;
	          return mindub;
	        }
	      }else{
	        System.out.println( "Stack underflow");
	        return -1;
	      }
	      
	    }

	    int top() {
	      if(size()>0){
	        if(min<=data.peek()){
	          return data.peek();
	        }else{
	          return min;
	        }
	      }else{
	        System.out.println( "Stack underflow");
	        return -1;
	      }
	    }

	    int min() {
	      return min;
	    }
	  }

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    MinStack st = new MinStack();

	    String str = br.readLine();
	    while (str.equals("quit") == false) {
	      if (str.startsWith("push")) {
	        int val = Integer.parseInt(str.split(" ")[1]);
	        st.push(val);
	      } else if (str.startsWith("pop")) {
	        int val = st.pop();
	        if (val != -1) {
	          System.out.println(val);
	        }
	      } else if (str.startsWith("top")) {
	        int val = st.top();
	        if (val != -1) {
	          System.out.println(val);
	        }
	      } else if (str.startsWith("size")) {
	        System.out.println(st.size());
	      } else if (str.startsWith("min")) {
	        int val = st.min();
	        if (val != -1) {
	          System.out.println(val);
	        }
	      }
	      str = br.readLine();
	    }

	}

}
