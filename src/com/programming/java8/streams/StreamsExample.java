package com.programming.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String [] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(34);
		l.add(45);
		l.add(15);
		l.add(6);
		
		// collect all even numbers
		
		List<Integer> l1 = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		// multiply each element by 2.
		
		l1 = l.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println(l1);
	}
}
