/**
 * 
 */
package com.pawan.coding.string;

import java.util.Scanner;

import com.pawan.coding.util.StringHelper;

/**
 * @author pawankumarthakur
 *
 */
public class StringCompression {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		StringHelper stringHelper = new StringHelper();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("compressed string is "+ stringHelper.compressString(str));

	}

}
