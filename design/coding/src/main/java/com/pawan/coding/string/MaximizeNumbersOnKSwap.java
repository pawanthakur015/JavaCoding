package com.pawan.coding.string;

public class MaximizeNumbersOnKSwap {

	public static int maxIndex(int []arr, int start, int end) {
		int index = start;
		for(int i=start;i<=end;i++) {
			if(arr[i]>arr[index]) {
				index = i;
			}
		}
		return index;
	}
	public static void moveMaxElementToBeginning(int []arr, int maxIndex, int start) {
		if(start==maxIndex)
			return ;
		for(int i=maxIndex;i>start;i--) {
			int tmp = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = tmp;
		}
	}
	public static void main(String[] args) {
		int []arr = {2 ,5,8,7,9};
		int k=2;
		int end=k, start=0, N=arr.length;
		while(k>0) {
			int maxIndx = maxIndex(arr, start, end);
			moveMaxElementToBeginning(arr, maxIndx, start);
			k = k-(maxIndx-start);
			start++;
		}
		
		for(int i=0;i<N;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
