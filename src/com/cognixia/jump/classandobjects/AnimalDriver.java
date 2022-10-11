package com.cognixia.jump.classandobjects;

public class AnimalDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//data type, variable name, optional value assignment	
		int counter = 0;
		//data type(class), variable name, instantiation using constructor.
		Animal animal1 = new Animal(); //Declaring variable, with custom data type.
		// new = i want reserve space in RAM for the class.
		Animal animal3 = new Animal("cow", 292);
		Horse horse1 = new Horse();
		//assigning value to the class attribute/variables
		//animal1.type="cat";
		//animal1.weight= 0.1;
		//method call / functions
		horse1.makeSound("neahhhhhhhhhhhhh");
		animal1.makeSound("meow.");
		System.out.println(animal3.getWeight());
		
	}

}
