package com.cognixia.jump.threads;

public class SyncThread extends Thread {

	private static int counter = 0;

	// sync counter
	public static synchronized void increment() {
		counter++;

	}

	public static synchronized void incrementAndPrint() {
		counter++;
		System.out.println("Thread" + Thread.currentThread().getId() + ": " + counter);
	}

	public static void staticblockIncreament() {
		System.out.println("-------------");

		synchronized (SyncThread.class) {
			counter++;
			System.out.println("Thread" + Thread.currentThread().getId() + ": " + counter);
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {

			// op1
			// increment();
			// System.out.println("Thread" + Thread.currentThread().getId() + ": " +
			// counter);
			// op2
			//incrementAndPrint();
			// op3
			staticblockIncreament();

		}
	}
}