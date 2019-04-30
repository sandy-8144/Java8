package com.programming.java8.lamdas;

public class TypeReferenceExample {

	public void doProcess(int i , Process p ) {
		p.process(i);
	}
	
	
	public void execute( ) {
         doProcess(12, i -> {
			// lamda preserve this reference.
			System.out.println("Value using lamda:"+i);
			System.out.println(this);
			
		}
				);  
	}
	
	public static void main (String [] args) {
		
		TypeReferenceExample ref = new TypeReferenceExample();
		ref.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Value using inner class:"+i);
				System.out.println(this);  // this points to inner anonymous class
				
			}
			
			@Override
			public String toString() {
				
				return "Inside inner class";
			}
			
			
		});
		
		
		ref.execute();
		
	}
	
	
	@Override
	public String toString() {
		
		return "Inside outer class";
	}
}
