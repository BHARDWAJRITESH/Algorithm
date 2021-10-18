package com.bridgelabs;

import java.util.Arrays;

public class Anagram {
	/**
	 * this method checks if two strings are anagram
	 * @param string1
	 * @param string2
	 * @return
	 */
	static boolean isAnagramSort(String string1, String string2) {
			if (string1.length() != string2.length()) {
				return false;
			}
			
			char[] a1 = string1.toCharArray();
			char[] a2 = string2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			return Arrays.equals(a1, a2);
	}
		/**
		 * 
		 * @param args
		 */
		public static void main(String[] args) {
			String s1 = "ritesh";
			String s2 = "iesthr";
			
			if(isAnagramSort(s1.toString(),s2.toString()))
				System.out.println("The two strings are" + " anagram of each other");
	        else
	            System.out.println("The two strings are not" + " anagram of each other");
			
		}

}
