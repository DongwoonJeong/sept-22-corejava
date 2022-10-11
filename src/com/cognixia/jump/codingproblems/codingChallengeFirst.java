package com.cognixia.jump.codingproblems;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class codingChallengeFirst {

	public static void main(String[] args) {
//1.	 Write a program that stores a list of strings, and the Strings are student
//		 names.
//		 make a list of at least 5 names.
//			- have a user menu to input a index of a student, and check to see what the
//			student name is, at that index.
//			- have exception handling in place, for the case that the index is out of bounds.
//			-Bonus: be able to look up a student(string) in the list by name.
//			-Bonus2: be able to take user input to add a student to the already existing list.

		List<String> stuName = new ArrayList<>();
		stuName.addAll(Arrays.asList("Zane", "DJ", "Bill", "Matthew", "Jabrel", "d"));
		boolean run = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("choose a option" + "\n1: searching index" + "\n2: look up name" + "\n3: add name");
		int option = scan.nextInt();

		if (option == 1) {
			getIndex(stuName);
		} else if (option == 2) {
			lookUp(stuName);
		} else if (option == 3) {
			addName(stuName);
		}

//		while (!run) {
//			getIndex(stuName, indexSearch);
//			lookUp(name);
//			addName(name);
//			run = true;
//		}
	}

	private static void getIndex(List<String> list) {
		try {
			System.out.println("enter a number to find a student name and index.");
			Scanner scan = new Scanner(System.in);
			int indexSearch = scan.nextInt();
			int index = indexSearch + 1;
			// System.out.println(stuName);
			System.out.println(list.get(indexSearch) + "'s index location is " + index);
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + "");
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage() + "");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void lookUp(List<String> list) {
		try {
			System.out.println("enter a name to find the index.");
			Scanner scan = new Scanner(System.in);
			String lookName = scan.next();
			
			if(list.contains(lookName)) {
				System.out.println(lookName + "is in the index of " + list.get(list.indexOf(lookName)));
			}else {
				System.out.println("the name does not exist in the list");
			}
			
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static void addName(List<String> list) {
		try {
			System.out.println("enter a name to add to the list.");
			Scanner scan = new Scanner(System.in);
			String addName = scan.next();
			list.add(addName);
			System.out.println(addName + " had been added to the list.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
