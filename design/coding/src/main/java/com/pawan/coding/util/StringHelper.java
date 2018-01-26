/**
 * 
 */
package com.pawan.coding.util;

/**
 * @author pawankumarthakur
 *
 */
public class StringHelper {

	private  int getCharNumber(char ch) {
		int a = Character.getNumericValue('a');
		int b = Character.getNumericValue('z');
		int val = Character.getNumericValue(ch);
		
		if(val >= a && val <=b) {
			return val - a;
		}
		
		return -1;
	}
	
	public  boolean isPalindromicPer(String str) {
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
	
   public  boolean oneEditAway(String str1, String str2) {
	   if(str1.length() == str2.length()) {
		   return oneEditReplace(str1, str2);
	   } else if(str1.length()-1 == str2.length()) {
		   return oneEditInsert(str2, str1);
	   } else if(str1.length() == str2.length()-1) {
		   return oneEditInsert(str1, str2);
	   }
	return false;
   }
   
   private boolean oneEditReplace(String str1, String str2) {
	   boolean findDiff = false;
	   for(int i=0;i<str1.length();i++) {
		   if(str1.charAt(i)!=str2.charAt(i)) {
			   if(findDiff) {
				   return false;
			   }
			   findDiff = true;
		   }
	   }
	   return true;
   }
   
   private boolean oneEditInsert(String str1, String str2) {
	   int index1 = 0;
	   int index2 = 0;
	   while(index1 < str1.length() && index2 < str2.length()) {
		   if(str1.charAt(index1)!= str2.charAt(index2)) {
			   if(index1 != index2) {
				   return false;
			   }
			   index2++;
		   } else {
			   index1++;
			   index2++;
		   }
	   }
	   return true;
   }
}
