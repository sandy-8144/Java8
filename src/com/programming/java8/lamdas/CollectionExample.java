package com.programming.java8.lamdas;

import java.util.Arrays;
import java.util.List;

public class CollectionExample {

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				new Person("sandy","sing",33),
				new Person("kally","ciw",37),
				new Person("charlce","choen",32),
				new Person("candy","bak",23),
				new Person("messy","david",43)
				
				);
		
		//classical for loop
		
		System.out.println("classical for loop");
		for(int i =0; i <persons.size();i++)
			System.out.println(persons.get(i));
		
		// for in loop
		
		System.out.println("for in loop");
		for(Person p : persons)
			System.out.println(p);
		
		// for each introduced in java 8
		System.out.println("for each loop with lambda");
		persons.forEach(p -> System.out.println(p));
		// or via method reference lamda
		
		System.out.println("for each loop with lambda method ref");
		persons.forEach(System.out::println);

	}

}
