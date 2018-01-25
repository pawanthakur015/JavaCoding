/**
 * 
 */
package com.pawan.coding.util;

/**
 * @author pawankumarthakur
 *
 */
public class StringHelper {

	private static int getCharNumber(char ch) {
		int a = Character.getNumericValue('a');
		int b = Character.getNumericValue('z');
		int val = Character.getNumericValue(ch);
		
		if(val >= a && val <=b) {
			return val - a;
		}
		
		return -1;
	}
	
	public static boolean isPalindromicPer(String str) {
		int []freq = new int [(Character.getNumericValue('z') - Character.getNumericValue('a'))+1];
		int oddValue=0;
		for(char ch : str.toCharArray()) {
			int index = getCharNumber(ch);
			if(index!=-1) {
				freq[index]++;
				if(freq[index]%2==1) {
					oddValue++;
				} else {
					oddValue--;
				}
			}
		}
		return oddValue <=1;
	}
}
