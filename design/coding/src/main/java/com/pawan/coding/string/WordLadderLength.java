/**
 * 
 */
package com.pawan.coding.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.pawan.coding.util.StringHelper;

/**
 * @author pawankumarthakur
 *
 */
public class WordLadderLength {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		StringHelper helper = new StringHelper();
		Scanner sc = new Scanner(System.in);
		String start = sc.next();
		String end = sc.next();
		Set<String> wordSet = new HashSet<String>();
		wordSet.add("poon");
		wordSet.add("plee");
		wordSet.add("same");
		wordSet.add("poie");
		wordSet.add("plie");
		wordSet.add("poin");
		wordSet.add("plea");
		
		System.out.println("total length = "+helper.wordLadderCount(wordSet, start, end));
	}

}
