/**
 * 
 */
package com.pawan.nobroker.helper;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pawankumarthakur
 *
 */
public class Helper {

	public static void findTripletSumComb(int []arr, int size, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<size;i++) {
			for(int j=i+1;j<size;j++) {
				int tmp = sum -(arr[i]+arr[j]);
				if(map.containsKey(tmp)) {
					System.out.println(i + " "+ j +" "+ map.get(tmp));
				} else {
					map.put(arr[i], i);
				}
			}
		}
	}
	
	public static boolean coinValidation(int cents) {
		boolean valid = false;
		switch(cents) {
		case 1 : 
			valid = true;
			break;
		case 5 : 
			valid = true;
			break;
		case 10 : 
			valid = true;
			break;
		case 25 : 
			valid = true;
			break;
		default : 
			valid = false;
		}
       return valid;
	}
}
