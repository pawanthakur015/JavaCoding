/**
 * 
 */
package com.pawan.coding.dp;

import java.util.Scanner;

import com.pawan.coding.util.DPHelper;

/**
 * @author pawankumarthakur
 *
 */
public class MagicIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DPHelper helper = new DPHelper();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int index = helper.magicIndex(arr, 0, n-1);
		if(index==-1) {
			System.out.println("not exist");
		} else {
			System.out.println("exist at "+ index);
		}
	}

}
