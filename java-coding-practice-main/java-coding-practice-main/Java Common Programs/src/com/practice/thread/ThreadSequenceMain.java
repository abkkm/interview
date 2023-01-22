package com.practice.thread;

public class ThreadSequenceMain {
	
	public static void main(String[] args) {
		
		//Create a new thread class and pass the class implementing runnable as a parameter
		try {
			MyRunnable runnableClass1 = new MyRunnable("Thread1");
			Thread t1 = new Thread(runnableClass1);
			
			//Start the thread
			t1.start();
			
			//Join methods make other threads to wait for this thread to finish execution
			t1.join();
			Thread.sleep(100); //Even if the current thread sleeps, other threads wait for it to complete
			//Create a new thread class and pass the class implementing runnable as a parameter
			MyRunnable runnableClass2 = new MyRunnable("Thread2");
			Thread t2 = new Thread(runnableClass2);
			
			//Start the thread
			t2.start();
			t2.join();
			
			//Create a new thread class and pass the class implementing runnable as a parameter
			MyRunnable runnableClass3 = new MyRunnable("Thread3");
			Thread t3 = new Thread(runnableClass3);
			
			//Start the thread
			t3.start();
			t3.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

