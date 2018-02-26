/**
 * Problem 3
 */
package com.pawan.nobroker.Main;

import java.util.Scanner;

import com.pawan.nobroker.helper.Helper;

/**
 * @author pawankumarthakur
 *
 */
public class TripletSum {

	/**
	 * Problem 3
	 * @param args
	 *
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		Helper.findTripletSumComb(arr, size, sum);
	}

}
