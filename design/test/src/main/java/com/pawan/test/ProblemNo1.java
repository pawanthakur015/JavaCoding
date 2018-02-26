package com.pawan.test;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemNo1 {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int[] numbers = new int[length];
		
		for(int i=0;i<length;i++) {
			numbers[i] = in.nextInt();
		}
		
		int k = in.nextInt();
		
		int result = find(numbers,k);
		System.out.println(result);
		in.close();
	}
	
	static int find(int[] numbers, int k)
	{
		int max = 0;
		
		int length = numbers.length;
		int i = 0;
		int l = k;
		
		int[] temp = new int[k];
		
		for(;i<=length-k;i++)
		{
			for(int j=0;j<l;j++)
			{
				temp[j] = numbers[i+j];
			}
			
			int result = 0;
			
			Arrays.sort(temp);
			for(int j=0;j<temp.length-1;j++)
			{
				result = result + (temp[j+1] - temp[j] - 1);
			}
		
			if(max == 0)
				max = result;
			else if(result < max)
				max = result;
		}
		
		return max;
	}
}
