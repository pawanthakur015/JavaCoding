/**
 * 
 */
package com.pawan.coding.string;

import com.pawan.coding.util.ArrayHelper;

/**
 * @author pawankumarthakur
 *
 */
public class MatrixRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		ArrayHelper helper = new ArrayHelper();
		helper.display(arr);
		System.out.println("After rotation of matrix by 90 deg in clock wise direction: ");
		helper.matrixRotation(arr);
		helper.display(arr);
	}

}
