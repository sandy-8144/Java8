package com.programming.java8.lamdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExcerciseSolJava7 {

	public static void main(String [] args) {
		
		List<Person> persons = Arrays.asList(
				new Person("sandy","sing",33),
				new Person("kally","ciw",37),
				new Person("charlce","choen",32),
				new Person("candy","bak",23),
				new Person("messy","david",43)
				
				);
		
		
		// 1. sort list by last name
		
		
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getLastName());
			}
			
			
			
			
		});
		
		// 2. print all elements
		
		printAll(persons);
		
		// 3. print all people , last name beginning with 'C'
		
		printConditionally(persons, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
			
			
		});
		
	}
	
	
	private static void printConditionally(List<Person> persons, Condition condition) {
		
		for(Person p : persons) {
			if(condition.test(p))
			   System.out.println(p);
		}
			
		
	}
	
	private static void printAll(List<Person> persons) {
		
		for(Person p : persons)
			System.out.println(p);
	}
	
	
}


interface Condition {
	
	boolean test(Person p);
	
}
