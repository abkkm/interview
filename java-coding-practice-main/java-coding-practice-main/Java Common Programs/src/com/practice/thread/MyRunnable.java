package com.practice.thread;

public class MyRunnable implements Runnable{
	
	private String threadName;
	
	public MyRunnable(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println("Inside run method of thread : "+ this.threadName);
		
	}

}
