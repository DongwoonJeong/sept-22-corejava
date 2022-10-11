package com.cognixia.jump.javabasics;

import com.cognixia.jump.classandobjects.Animal;

// this will declairng, instatiating, reading, writing, looping through arrays of
// both primitive values, and objects.
public class ArrayDemoDriver {

	public static void main(String[] args) {
	
		// Declare an array
		int[] tempratures;
		int grades[] = {90, 85, 87, 70};
		
		// instatiate
		tempratures = new int[5];
		Animal[] animals = {
				new Animal(),
				new Animal("horse", 500.0),
				new Animal("cat", 20.0),
				new Animal("dog", 20.0)
		};
		Animal[] altAnimals = new Animal[3];
		
		//read from array
		System.out.println(animals[0]);
		System.out.println(altAnimals[0]);
		
		// array out of bounds
		System.out.println(grades[0]);
		
		//write to array
		grades[0] = 100;
		System.out.println(grades[0]);
		System.out.println(animals[1]);
		
		animals[1]=null;
		System.out.println(animals[1]);
		
		//Iterating through an array
		// while loop is not optimal
		int counter = 0;
		while(counter < grades.length) {
			System.out.println(grades[counter++]);
			
		}
		// use for loop instead;
		for(int i =0; i <grades.length; i++) {
			System.out.println(grades[i]);
		}
		for(int i =grades.length-1; i >=0; i--) {
			System.out.println(grades[i]);
		}
		
		//for each loop
		for(int grade : grades){
			System.out.println(grade);
			
		}
////		for(Animal animal : animals){
////			if(animal.getType().equals("dog")) {
////				animal.setType("bear");
////			}
////			
////			System.out.println(animal);
//			
//		}
		
		char[][] grid = {
				{'a','b','c'},
				{'d','e','f'},
				{'g','h','i'}
					};
		for(int row = 0; row< grid.length; row++) {
			for(int col =0; col <grid[row].length; col++) {
				System.out.println(grid[row][col]);
			}
				}
		
	}

}
