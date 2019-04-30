package com.programming.java8.generics;

public class GenericClass<T extends Number> {

	private T t=null;
	
	public GenericClass(T o) {
		
		this.t = o;
	}
	
	
	public T getObject() {
		return t;
	}
	
}
