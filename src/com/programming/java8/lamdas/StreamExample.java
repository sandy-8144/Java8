package com.programming.java8.lamdas;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("sandy","sing",33),
				new Person("kally","ciw",37),
				new Person("charlce","choen",32),
				new Person("candy","bak",23),
				new Person("messy","david",43)
				
				);
		//Streams are like Assembly line belt in automobile garage.
		// Streams are view on collections. Each collection has stream methods
		persons.stream()
		.filter(p -> p.getLastName().startsWith("c"))
		.forEach(p -> System.out.println(p.getFirstName()));
		
		
		long count = persons.stream()
		.filter(p -> p.getLastName().startsWith("d"))
		.count();
		
		System.out.println("count on stream:"+count);
		System.out.println("count on collection:"+persons.size());

	}

}
