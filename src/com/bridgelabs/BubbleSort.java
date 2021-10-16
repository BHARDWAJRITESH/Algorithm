package com.bridgelabs;

public class BubbleSort {
	static int MAX = 100;
	  public static void sortStrings(String[] arr, int n){
	        String temp;
	        for (int j = 0; j < n - 1; j++){
	            for (int i = j + 1; i < n; i++) {
	                if (arr[j].compareTo(arr[i]) > 0){
	                    temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i] = temp;
	                }
	            }
	        }
	    }
	  public static void printArray(String[] arr) {
			System.out.println("Array after sorting is :");
			for (String j : arr) {
				System.out.println(j + " ");
			}
		}

		public static void main(String[] args) {
			String[] arr = {"ritesh","mukesh","vaibhav","yash","happy"};
			int n = arr.length;
	        sortStrings(arr, n);
	        printArray(arr);
		}

}
