package com.programming.java8.lamdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UnitExcerciseSolJava8 {
public static void main(String [] args) {
		
		List<Person> persons = Arrays.asList(
				new Person("sandy","sing",33),
				new Person("kally","ciw",37),
				new Person("charlce","choen",32),
				new Person("candy","bak",23),
				new Person("messy","david",43)
				
				);
		
		
		// 1. sort list by last name
		
		
		Collections.sort(persons, (p1,p2) -> p1.getFirstName().compareTo(p2.getLastName()));
		
		// 2. print all elements
		
		printConditionally(persons, p -> true,p -> System.out.println(p));
		
		// 3. print all people , last name beginning with 'C'
		
		printConditionally(persons,p -> p.getLastName().startsWith("c"), p -> System.out.println(p.getLastName()));
		
	}
	
	
	private static void printConditionally(List<Person> persons, Predicate<Person> condition, Consumer<Person> consumer) {
		
		for(Person p : persons) {
			if(condition.test(p))
			   //System.out.println(p);
				consumer.accept(p);
		}
			
		
	}
	
	
	
	
}


