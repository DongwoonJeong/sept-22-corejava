package com.cognixia.jump.threads;

import java.util.Iterator;

public class SyncThreadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 3;
		Thread[] threads = new Thread[size];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new SyncThread();
			threads[i].start();
		}
		
		
	}

}
