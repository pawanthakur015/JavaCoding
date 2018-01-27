/**
 * 
 */
package com.pawan.coding.util;

/**
 * @author pawankumarthakur
 *
 */
public class ArrayHelper {

	public void matrixRotation(int[][] matrix) {
		int n = matrix.length;
		for(int l=0;l<n/2;l++) {
			int last = n-1-l;
			for(int first=l;first<last;first++) {
				int top = matrix[l][first];
				//--top to left--
				matrix[l][first] = matrix[last-first][l];
				//--left to bottom--
				matrix[last-first][l] = matrix[last-l][last-first];
				//--bottom to right--
				matrix[last-l][last-first] = matrix[first][last-l];
				//--right to top--
				matrix[first][last-l] = top;
			}
		}
	}

	public void display(int arr[][]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
