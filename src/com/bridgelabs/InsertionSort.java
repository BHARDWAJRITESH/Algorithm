package com.bridgelabs;

public class InsertionSort {
	
	public static void sort(String [] arr) {
		for(int i=0; i <arr.length-1; i++) {
			for(int j = i+1; j > 0; j--) {
				if(arr[j].compareTo(arr[j - 1]) < 0) {
					String temp = arr[j];
					arr[j] = arr[j -1];
					arr[j-1]= temp;					
				}
			}
		}
	}
	
	public static void printArray(String[] arr) {
		int length = arr.length;
		System.out.println("Array after sorting is :");
		for (String j : arr) {
			System.out.println(j + " ");
		}
	}

	public static void main(String[] args) {
		String[] arr = {"ritesh","mukesh","vaibhav","yash","happy"};
		sort(arr);
		printArray(arr);
	}
}
