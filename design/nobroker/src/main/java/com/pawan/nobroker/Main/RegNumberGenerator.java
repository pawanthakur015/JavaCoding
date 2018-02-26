package com.pawan.nobroker.Main;

/**
 * Problem 2
 */
import java.util.Scanner;

public class RegNumberGenerator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int inc = sc.nextInt();
		String output = "";
		String []inputArr = input.split("\\s+");
		int num = Integer.parseInt(inputArr[2]);
		int incNum = num+inc;
		if(incNum<9999) {
			output = inputArr[0]+" "+inputArr[1]+String.valueOf(incNum);
		} else {
			int remaining = incNum-9999;
			char a = inputArr[1].charAt(1);
			a = (char) ((char)a + remaining);
			char b;
			if(a>='Z') {
			    b = (char) (inputArr[1].charAt(0) + 1);
			    a = 'A';
			} else {
				b = inputArr[1].charAt(0);
			}
			output = inputArr[0]+" "+b+a+"0000";
		}
		System.out.println(output);
		/*StringBuilder sb = new StringBuilder();
		int counter = 0;
		if (input.charAt(input.length() - 1) == '9') {
			for (int i = input.length() - 1; i > 5; i--) {
				if (input.charAt(i) == '9') {
					counter = 1;
					sb.append(0);
				} else {
					sb.append(input.charAt(i) + counter);
					counter = 0;
				}
			}
		}
		
		if(input.charAt(5)!='Z' || counter ==1) {
			sb.append(input.charAt(5) + counter);
			sb.append(input.charAt(4));
		} 
		
		if(input.charAt(5)=='Z' || counter ==1) {
			sb.append('A');
			sb.append(input.charAt(4)+1);
		}
		
		if(counter==0) {
			sb.append(input.charAt(5));
			sb.append(input.charAt(4));
		}

		System.out.println(input.substring(0, 4)+" "+sb.reverse());*/
	}

}
