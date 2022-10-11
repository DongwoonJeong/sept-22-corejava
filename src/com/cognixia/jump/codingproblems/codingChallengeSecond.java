package com.cognixia.jump.codingproblems;

public class codingChallengeSecond {
	// 2. Write a program that has two numbers, x and y. be able to assign values to
	// x and y,
	// and then swap their values so that x is now y, and y is now x. Do this
	// without
	// using temp variable, HINT - this is purely math.
	public static void main(String[] args) {
		int x = 11;
		int y = 22;
		swap(x, y);
	}

	private static void swap(int x, int y) {
		System.out.println("the OG values are " + x + ", and " + y);
		// using operator (found it on GeeksforGeeks)
		// x = x ^ y ^ (y = x);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("the swapped values are " + x + ", and " + y);
	}

}
