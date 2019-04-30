package com.programming.java8.defaultinterface;

public interface DefaultInterface1 {

	default void m1() {
		System.out.println("m1: Inside default interface 1");
	}
	
	
	default void m2() {
		System.out.println("m2: Inside default interface 1");
	}
	
	public static void myMethod() { // static method required body
		
		System.out.println("This is static method");
		
	}
	
	
	public static void main ( String [] args) {
		   
		System.out.println("main method in super interface ");
	   }
}
