package com.cognixia.jump.exceptionhandling;

import java.util.*;

public class ExceptionDriver {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int inNum = 0;
		
		inNum = tryCatch(input, inNum);
		
		System.out.println("outside try , input was " + inNum);

	}

	private static int tryCatch(Scanner input, int inNum) {
		try {
			System.out.println("input int");
			inNum = input.nextInt();

			int ans = 10 / inNum;
			System.out.println(ans);

		} catch (Exception e) { // empty catch block is BAD practice.
			// TODO: handle exception
			System.out.println("Input a int only");
		}
		return inNum;
	}

}
