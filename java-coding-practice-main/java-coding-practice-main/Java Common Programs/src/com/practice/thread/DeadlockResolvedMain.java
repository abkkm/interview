package com.practice.thread;

public class DeadlockResolvedMain {

	public static void main(String[] args) {
		final String resource1 = "resource1";
		final String resource2 = "resoruce2";
		// t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: locked resource 1");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (resource2) {
						System.out.println("Thread 1: locked resource 2");
					}
				}
			}
		};

		// obtain and release the locks in the same order as t1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 2: locked resource 2");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (resource2) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}



}
