package com.programming.java8.dataandtime;

import java.time.*;

public class PeriodAndYearClass {

	public static void main(String[] args) {
		
		LocalDate start = LocalDate.of(1994, Month.JANUARY, 17);
		LocalDate end = LocalDate.of(2019, Month.MARCH, 20);
		
		Period p = Period.between(start, end);
		
		System.out.printf("No of %d:%d:%d ",p.getYears(),p.getMonths(),p.getDays());
		
		Year yr = Year.of(1994);
		
		System.out.println("is leap year:"+yr.isLeap());
		
		
	}
}
