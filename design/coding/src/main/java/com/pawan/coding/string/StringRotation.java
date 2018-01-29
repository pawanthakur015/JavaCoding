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
public class StringRotation {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		StringHelper stringHelper = new StringHelper();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if(stringHelper.isRotation(str1, str2)) {
			System.out.println(str2 +" is rotation of "+str1);
		} else {
			System.out.println(str2 +" is not a rotation of "+str1);
		}
	}

}
