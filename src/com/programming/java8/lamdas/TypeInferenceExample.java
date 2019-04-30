package com.programming.java8.lamdas;

public class TypeInferenceExample {

	public static void main(String [] args) {
		
		StringLength s1 = s -> s.length();
		StringLength s2 = (s) -> s.length();
		StringLength s3 = (String s) -> s.length();
		
		System.out.println("first:"+s1.getLength("one"));
		System.out.println("second:"+s2.getLength("two2"));
		System.out.println("third:"+s3.getLength("three"));
		
	}
}

interface StringLength {
	
	int getLength(String s);
	
}