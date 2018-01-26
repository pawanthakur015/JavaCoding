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
public class OneAwayEditString {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		StringHelper stringHelper = new StringHelper();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if(stringHelper.oneEditAway(str1, str2)) {
			System.out.println("---These two string are zero or one edit away---");
		} else {
			System.out.println("---These two string are more than two edit away---");
		}
	}

}
