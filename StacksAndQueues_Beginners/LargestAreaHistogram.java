package StacksAndQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class LargestAreaHistogram {

	public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		    int n = Integer.parseInt(br.readLine());
		    int[] a = new int[n];
		    for(int i = 0; i < n; i++){
		       a[i] = Integer.parseInt(br.readLine());
		    }
		    
		    Stack <Integer> st = new Stack<>();
		    Stack <Integer> st1 = new Stack<>();
		    int []area = new int[a.length];
		    area[0]=a[0];
		    st.push(0);
		    st1.push(a.length-1);
			for(int i=1;i<a.length;i++) {
				if(a[i]<=a[st.peek()]) {
					while(st.size()>0 && a[st.peek()]>=a[i]) {
						st.pop();
					}
					if(st.size()==0) {
						area[i]+=a[i]*(i+1);
					}else {
						area[i]+=a[i]*(i-st.peek());
					}
				}else {
					area[i]+=a[i]*(i-st.peek());
				}
				st.push(i);
			}
			for(int i=a.length-2;i>=0;i--){
				if(a[i]<=a[st1.peek()]){
					while(st1.size()>0 && a[st1.peek()]>=a[i]){
						st1.pop();
					}
					if(st1.size()==0){
						area[i]+=a[i]*(a.length-1-i);
					}else{
						area[i]+=a[i]*(st1.peek()-i-1);
					}
				}else{
					area[i]+=0;
				}
				st1.push(i);
			}
			int max =0;
			for(int i=0;i<area.length;i++){
				if(max<area[i]) {
					max =area[i];
				}
			}
			System.out.println(max);
			
	}

}
