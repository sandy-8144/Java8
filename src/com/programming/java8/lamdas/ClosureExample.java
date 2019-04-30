package com.programming.java8.lamdas;

public class ClosureExample {
	private static int x=30;
	

	public static void main(String[] args) {
		int a = 10;
		int b =20;
		x=60; // class instance variable can be re-assigned.
		//b=12; // will not compile.
		// b needs to be effectively final, means its value should not be changed after declaration. it is applicable for local variable not 
		// class instance variable. local var refere from lambda expression must be final or effectivly final. expression block is considered
		// as closure because method local variable's value is freezed.
		doProcess(a, i -> System.out.println(i + b+x));
		

	}
	
	
	private static void doProcess(int i , Process p) {
		p.process(i);
	}

}


interface Process{
	
	void process(int i);
}