package Recursion;

import java.util.Scanner;

public class AllIndicesOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		int iarr[]=allIndices(arr,x,0,0);
		if(iarr.length == 0){
            System.out.println("NO OUTPUT");
            sc.close();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
		sc.close();

	}

	public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
		if(idx==arr.length-1) {
			int iarr[]=new int[fsf];
			return iarr;
		}
		if(arr[idx]==x) {
			int []iarr=allIndices(arr,x,idx+1,fsf+1);
			iarr[fsf]=idx;
			return iarr;
		}
		else {
			int []iarr=allIndices(arr,x,idx+1,fsf);
			return iarr;
		}
	}

}
