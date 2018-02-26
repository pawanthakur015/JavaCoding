package com.pawan.coding.util;

import java.util.Arrays;

public class DPHelper {

	public int tripleStep(int n) {
		if(n<=0)
			return 0;
		int []count = new int[n+1];
		Arrays.fill(count, -1);
		return tripleStepUtil(n, count);
	}
	
	public int magicIndex(int []arr, int start, int end) {
		while(start<=end) {
			int mid = (start+end)/2;
			if(mid == arr[mid]) {
				return mid;
			} else if(mid <arr[mid]) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		return -1;
	}
	
	private int tripleStepUtil(int n, int []count) {
		if(n<0)
			return 0;
		else if(n==0)
			return 1;
		else if(count[n]>-1)
			return count[n];
		else {
			count[n] = tripleStepUtil(n - 1, count) + tripleStepUtil(n - 2, count) + tripleStepUtil(n - 3, count);
			return count[n];
		}
	}
}
