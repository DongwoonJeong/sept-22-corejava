package com.cognixia.jump.classandobjects;

public class Animal {
	
	//A basic class is known in java as a POJO
	//Plain old java object or also a
	// bean(java)
	
	// Attributes
	// Absence of modifiers make variables // attributes DEFAULT
	private String type;
	private double weight;
	
	
	
	@Override
	public String toString() {
		return "Animal [type=" + type + ", weight=" + weight + "]";
	}

	//Constructors
	public Animal(){
		this.type ="N/A";
		this.weight= 0.0;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Animal(String type, double weight){
		this.type=type;
		this.weight=weight;
	}
	
	//Methods
	//void = going to take an action but not returning any value;
	void makeSound(String sound) {
		System.out.println(type+ " make sound "+ sound + " weight " + weight);
	}
}
