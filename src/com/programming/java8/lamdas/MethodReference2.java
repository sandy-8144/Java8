package com.programming.java8.lamdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReference2 {

	
		public static void main(String [] args) {
			
			List<Person> persons = Arrays.asList(
					new Person("sandy","sing",33),
					new Person("kally","ciw",37),
					new Person("charlce","choen",32),
					new Person("candy","bak",23),
					new Person("messy","david",43)
					
					);
			
			
			
			
			printConditionally(persons,p -> p.getLastName().startsWith("c"), System.out::println); // p -> method(p)
			
		}
		
		
		private static void printConditionally(List<Person> persons, Predicate<Person> condition, Consumer<Person> consumer) {
			
			for(Person p : persons) {
				if(condition.test(p))
				   //System.out.println(p);
					consumer.accept(p);
			}
				
			
		}
		
		
	
	
	
	

}
