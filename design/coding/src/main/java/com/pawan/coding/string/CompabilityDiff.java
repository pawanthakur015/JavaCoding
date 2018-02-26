package com.pawan.coding.string;

public class CompabilityDiff {

	public static void main(String[] args) {
		
		int []arr = {3,1,2,4,5};
		int []arr1 = {3,2,4,1,5};
		int relativeDiff = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr1[i]) {
				int j = i+1;
				while(arr[i]!=arr1[j]) {
					j++;
				}
				while(j!=i) {
					int tmp = arr1[j];
					arr1[j]= arr1[j-1];
					arr1[j-1] = tmp;
					j--;
					relativeDiff++;
				}
			}
		}
		System.out.println("relative diff = "+ relativeDiff);
	}

}
