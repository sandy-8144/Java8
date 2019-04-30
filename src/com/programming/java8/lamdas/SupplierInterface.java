package com.programming.java8.lamdas;

import java.util.function.Supplier;

public class SupplierInterface {

public static void main (String [] args) {
		
		Supplier<String> s = () -> {
				
				String [] name = {"sandy","my","qwe","pjkj"};
				int index = (int)( Math.random()*3+1);  // math.random() returns value from 0.0 to less than 1
				return name[index];								
		};
		
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	
}
}
