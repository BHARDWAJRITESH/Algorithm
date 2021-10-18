package com.bridgelabs;

public class PrimeNumber {
	public static void main(String args[]) {
		for (int number = 1; number <= 1000; number++) {
			int count = 0;
			for (int i = 2;i <= number-1;i++) {
				if(number%i == 0) {
					count = count + 1; 
				}
			}
			if (count == 0) {
				System.out.println("prime number: "+number);
			}
		}
	}

}
