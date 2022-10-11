package com.cognixia.jump.threads;

// runner to test NumbersRun class
public class NumbersRunRunner {

	public static void main(String[] args) {

		// get the id for the main thread
		System.out.println("Main Thread ID: " + Thread.currentThread().getId());

		// use a loop to create and start multiple threads
		for (int i = 0; i < 3; i++) {

			new Thread( new NumbersRun() ).start(); // must create a Thread and pass in the object that
		}											// implements Runnable to start the thread

	}

}
