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
public class TripleStep {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DPHelper helper = new DPHelper();
		Scanner sc = new Scanner(System.in);
		/* find triplet sum */
		int n = sc.nextInt();
		System.out.println(helper.tripleStep(n));
		/* find magic index */
	}

}
