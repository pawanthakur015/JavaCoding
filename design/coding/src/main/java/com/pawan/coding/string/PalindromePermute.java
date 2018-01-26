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
public class PalindromePermute {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		StringHelper stringHelper = new StringHelper();
		Scanner sc = new Scanner(System.in);
		String Str = sc.next();
		if(stringHelper.isPalindromicPer(Str)) {
			System.out.println("palindromic permutation");
		} else {
			System.out.println("Not palindromic permutation");
		}
	}

}
