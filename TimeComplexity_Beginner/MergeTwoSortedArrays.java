package TimeComplexity;

import java.util.Scanner;

public class MergeTwoSortedArrays {
	
	public static int[] mergeTwoSortedArrays(int[] a, int[] b){
	    //write your code here
	    int i=0;
	    int j=0;
	    int tl=a.length + b.length;
	    int []arr=new int[tl];
	    int k =0;
	    while(k<arr.length) {
	    	if(i==a.length) {
	            arr[k]=b[j];
	            k++;
	            j++;
	    	}else if(j==b.length){
	    		arr[k]=a[i];
	            k++;
	            i++;
	    	}else {
	    		if(a[i]<b[j]) {
	    			arr[k]=a[i];
	        		i++;
	        		k++;
	        	}else if(a[i]>b[j]) {
	        		arr[k]=a[j];
	        		j++;
	        		k++;
	        	}else if(a[i]==a[j]) {
	        		arr[k]=a[i];
	        		i++;
	        		k++;
	        		arr[k]=a[j];
	        		j++;
	        		k++;
	        	}
	    	}
	    }
	    return arr;
	}

	  public static void print(int[] arr){
	    for(int i = 0 ; i < arr.length; i++){
	      System.out.println(arr[i]);
	    }
	  }

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] a = new int[n];
	    for(int i = 0 ; i < n; i++){
	      a[i] = scn.nextInt();
	    }
	    int m = scn.nextInt();
	    int[] b = new int[m];
	    for(int i = 0 ; i < m; i++){
	      b[i] = scn.nextInt();
	    }
	    int[] mergedArray = mergeTwoSortedArrays(a,b);
	    print(mergedArray);
	    scn.close();
	}

}
