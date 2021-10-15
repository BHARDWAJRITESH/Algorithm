package com.bridgelabs;

import java.util.Scanner;

public class Permutation {
	
	/**
	 * creating method solution
	 * @param string
	 */
	public static void solution(String string) {
		int number = string.length();
		int factor = factorial(number);
		for (int i = 0;i < factor; i++) {
			StringBuilder stringBuilder = new StringBuilder(string);
			int temp = i;
			for (int div =number; div >= 1; div--) {
				int quotient = temp / div;
				int remainder = temp % div;
				
				System.out.println(stringBuilder.charAt(remainder));
				stringBuilder.deleteCharAt(remainder);
				
				temp = quotient;				
			}
			System.out.println();
		}
	}
	/**
	 * creating parameterised factorial method
	 * @param number
	 * @return
	 */
	public static int factorial(int number) {
		int value = 1;
		for (int i = 2; i <= number; i++) {
			value *= i;
		}
		return value;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a ssstring to return its permutation : ");
		String string = scan.next();
		solution(string);
	}
}
