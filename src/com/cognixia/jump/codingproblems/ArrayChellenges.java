package com.cognixia.jump.codingproblems;
import java.util.*;

public class ArrayChellenges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {4, 2, 3, 1};
		int[] arr2= {7,8,6,1};
		int[] arr3= {1,2,4,5,6,7,8,9,10,11,12,3,13};
		/* try to generate an array with the randomly missing number
		 * 
		 * 
		 * 
		 * */
			if(challenge1(arr1, arr2) == true) {
				System.out.println("matches");
			}else {
				System.out.println("does not match");
			}
			System.out.println("The missing number is:" + challenge2(arr3));
	}
	//method with solution
	static boolean challenge1(int[] arr1, int[] arr2){
		//have 2 arrays to compare
		//if the those array's length does not match, no need to excute the logic.
		if(arr1.length != arr2.length) {
			return false;
		}
		//sort the arrays so that it can be compared by each element.
		// static method from library.
		Arrays.sort(arr1);		
		Arrays.sort(arr2);
		// a loop that goes through array.
		for(int i =0; i <arr1.length; i++) {
			// if array 1, and array 2's each element doesn't match, return false.
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
	
	static int challenge2(int[] arr) {
		// if no number is missing in the array, the last number is missing.
		int missingNum = arr.length;
		//sort the array in the order so that the index and the data can be compared.
		Arrays.sort(arr);		
		//compare between index and data in the array.
		//i as an index number on the array.
		// if i does not match with the data in the array, return index+1;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] != i+1) {
				return i +1;
			}
				}
		// if no number is missing in the array, the last number is missing.
		return missingNum+1;
	}
}


