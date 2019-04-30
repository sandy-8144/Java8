package com.programming.java8.lamdas;

public class Greeter {

	public static void greet(Greeting g) {
		g.perform();
	}
	
	public static void main(String [] args) {
		
		
		Greeting lamdaExp1 = () -> System.out.println("My name");
		lamdaExp1.perform();
		greet(lamdaExp1);
		greet(() -> System.out.println("My name"));
		
		
		
	}
}
