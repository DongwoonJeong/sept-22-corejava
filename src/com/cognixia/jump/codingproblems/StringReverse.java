package com.cognixia.jump.codingproblems;

public class StringReverse {

	public static void main(String[] args) {
		
		//string builder built in method
		StringBuilder str1 = new StringBuilder("Hello");
		System.out.println(str1.reverse().toString());
		//exercise 2
		String str2 ="Hello World";
		System.out.println(reverse(str2));
		//bonus exercise
		String str3 = "for the bonus excercise eee aa x cz sasdqwd";
		bonus(str3);
	}
	
	public static String reverse(String str) {
		String ans ="";
		for(int i=str.length()-1; i>=0; i--) {
			ans += str.charAt(i);
		}return ans;
	}
	
	static void bonus(String str) {
		String[] bn = str.split(" ");
        for (String bonus : bn)
        	System.out.print(reverse(bonus)+" ");
	}
}
