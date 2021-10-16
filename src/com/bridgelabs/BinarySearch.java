/**
 * 
 */
package com.bridgelabs;

import java.util.ArrayList;

/**
 * @author Ritesh
 *
 */
public class BinarySearch<T extends Comparable<T>>{
	
		public int binarySearch(T[] arr, T x) {
			int left = 0, right = arr.length - 1;
			 while (left <= right) {
				 int mid = left + (right - left ) / 2;
				 int res = x.compareTo(arr[mid]);
				 if (res == 0)
					 return mid;
				 if(res > 0)
					 left = mid + 1;
				 else
					 right = mid - 1;
			 }
			 return -1;
		}
		public static void main(String args []) {
			BinarySearch<String> object = new BinarySearch<String>();
			
			ArrayList<String> array = new ArrayList<String>();
			array.add("ritesh");
			array.add("mukesh");
			array.add("vaibhav");
			array.add("yash");
			array.add("happy");
			
			String[] arr = {"ritesh","mukesh","vaibhav","yash","happy"};
			String x = "yash";
			System.out.println("the elements of the arraylist are: " +array);
			int result = object.binarySearch(arr, x);
			if (result == -1)
				System.out.println("Element not present");
			else 
				System.out.println("the element "+ x +" is found at " +"index "+ result+".");
			
		}

}
