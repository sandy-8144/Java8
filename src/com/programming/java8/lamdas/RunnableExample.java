package com.programming.java8.lamdas;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread t1 = new Thread( new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread without lamda");
				
			}
			
		});

		Thread t2 = new Thread(() -> System.out.println("Thread with lamda"));
		
		t1.start();
		t2.start();
	}

}
