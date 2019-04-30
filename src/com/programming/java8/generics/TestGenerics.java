package com.programming.java8.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {

	public static void main(String [] args) {
		
		System.out.println(System.nanoTime());
		
		List<String> l1 = new ArrayList<String>();
		List<?> l2 = new ArrayList<String>();
		List<?> l3 = new ArrayList<Integer>();
		List<? extends Number> l4 = new ArrayList<Integer>();
		//---> Invalid. Incompatible types.
	//	List<? extends Number> l5 = new ArrayList<String>();
		List<? super String> l6 = new ArrayList<Object>();
		//Invalid. unexpected value, found: ? , required class or interface without bound.
		
		//List<?> l7 = new ArrayList<?>(); 
	//	Invalid. unexpected value, found: ? , required class or interface without bound.
		//List<?> l8 = new ArrayList<? extends Number>(); 
				
				
		
		List<String> list = new ArrayList<String>();
		list.add("sandeep");
		list.add("test");
		m1(list);
		m5(list);
		m6(list);
		System.out.println(list);
		
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(13);
		intList.add(14);
		intList.add(16);
		m2(intList);
		m3(intList);
		//m3(list);
		

		}

        @SuppressWarnings("unchecked")
		public static void  m1(List  l)
		{
        	
        	//anything can be added.
		   l.add(10);
		   l.add(10.5);
		   l.add(true);
		}
        
        
       
		public static void  m5(List <?> l)
		{
        	//Nothing can be added.
		   /*l.add(10);
		   l.add(10.5);
		   l.add(true);*/
		}
        
		
		public static void  m6(List <String> l)
		{
			// only string can be added
		   l.add("test1");
		   l.add("test2");
		  // l.add(10);  error
		}
        
        
		public static void  m2(List <? extends Integer> l)
		{
			// No addition allowd.
		   /*l.add(new Integer(10));
		   l.add(10.5);*/
			
			// l.add(new Integer(10));
		  
		}
		
		
		public static void  m3(List <? super Integer> l)
		{
			// Only 'X' is allowed
		   l.add(new Integer(10));		   
		  
		}
		
		public static void  m4(List <? super Runnable> l)
		{
			// Only 'X' is allowed
		   l.add( new Runnable() {
			@Override
			public void run() {
				System.out.println("Running....");
			}
		   });		   
		  
		}
		
		
		
		
	
}
