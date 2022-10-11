
// 3. Palindrome - word if reversed still has the same spelling as it would be
// forward,
// ie "wow" "mom" "dad".
// Write a method that takes in a String, and returns true or false
// if that input string is a palindrome. case sensitivity does NOT matter.

package com.cognixia.jump.codingproblems;

import java.util.Scanner;

public class codingChallengeThird extends StringReverse {

	public static void main(String[] args) {
		System.out.println("enter a word");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		// making not case sensitive
		System.out.println(isPalindrome(input.toLowerCase()));
		scan.close();
	}

	private static boolean isPalindrome(String input) {
//		public static String reverse(String str) {
//			String ans ="";
//			for(int i=str.length()-1; i>=0; i--) {
//				ans += str.charAt(i);
//			}return ans;
//		}
		if (input.length() == 1 || input.length() == 0) {
			return false;
		} else {
			// extends method from the StringReverse class
			String rev = reverse(input);
			if (rev.equals(input)) {
				return true;
			} else {
				return false;
			}
		}
	}

}
