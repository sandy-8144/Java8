package com.programming.java8.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReading {

	public static void example1() throws Exception {
		System.out.println("Inside example1..");
Stream<String> rows = Files.lines(Paths.get("/Users/sandsasi/Prep/Streams/test_stream.txt"));
	    
		rows
		.sorted()
		.map(x -> x.toLowerCase())
		.forEach(System.out::println);
		rows.close();
	}
	
	
	public static void example2() throws Exception {
		
		System.out.println("Inside example2..");
		List<String> list = new ArrayList<String>();
		Stream<String> rows = Files.lines(Paths.get("/Users/sandsasi/Prep/Streams/test_stream.txt"));
			    
		list = 	rows
				.sorted()
				.map(x -> x.toLowerCase())
				.filter(x ->x.startsWith("12"))
	            .collect(Collectors.toList());
		rows.close();
		
		list.forEach(System.out::println);
			}
	
	
	public static void example3() throws Exception{
		System.out.println("Inside example3..");
		BufferedReader br = new BufferedReader(new FileReader("/Users/sandsasi/Prep/Streams/test_stream.txt"));
		String line=null;
		while((line = br.readLine())!=null)
			System.out.println(line);
		
		br.close();
		
		
	}
	
	public static void main(String [] args) throws Exception
	{

             FileReading.example1();
             FileReading.example2();
             FileReading.example3();
             Collections.sort(null);
		
	}
}
