package com.programming.java8.optionals;

import java.util.Optional;

public class OptionalExample {

	public static void main(String [] args) {
		String name=null;
		
		if(name!=null)
			System.out.println("printing name:"+name);
		else
			System.out.println("printing default name:sandy");
		
		Optional<String> opt = Optional.ofNullable(name);
		System.out.println(opt.orElse("sandy1").toUpperCase());
		System.out.println(opt.orElseThrow(() -> new IllegalArgumentException("throwing from optional")));
		
		
		
	}
}
