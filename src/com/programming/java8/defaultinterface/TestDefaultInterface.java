package com.programming.java8.defaultinterface;

public class TestDefaultInterface implements DefaultInterface1,DefaultInterface2{
/*
 * 
 * (non-Javadoc)
 * @see com.programming.java8.defaultinterface.DefaultInterface1#m1()
 * In case of multiple inheritance with same method, 
 */
	@Override
	public void m1() {
		
		DefaultInterface1.super.m1();
	}
	
	
   public static void myMethod() { // static method required body
		
		System.out.println("This is child static method");
		
	}

   
   public static void main ( String [] args) {
	   TestDefaultInterface in = new TestDefaultInterface();
	   in.myMethod(); // child method will get called.
	   
	   DefaultInterface1 dt = new TestDefaultInterface();
	   DefaultInterface1.myMethod();
	   // dt.myMethod(); // throws compile time exception
	   
	   
   }
}
