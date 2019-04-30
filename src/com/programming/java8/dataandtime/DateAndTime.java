package com.programming.java8.dataandtime;

import java.time.*;

public class DateAndTime {

	public static void main(String[] args) {
		
      LocalDate date = LocalDate.now();
      LocalTime time = LocalTime.now();
      
      int dd = date.getDayOfMonth();
      int mm = date.getMonthValue();
      int yyyy = date.getYear();
      
      
      int h = time.getHour();
      int m = time.getMinute();
      int s = time.getSecond();
      int n = time.getNano();
      
      System.out.println("Date:"+date);
      System.out.println("Time:"+time);
      
      System.out.println(dd+".."+mm+".."+yyyy);
      System.out.printf("%d-%d-%d",dd,mm,yyyy);
      System.out.println();
      System.out.printf("%d:%d:%d:%d",h,m,s,n);
      
      System.out.println();
      System.out.println("date time api....");
      
      
      LocalDateTime dt = LocalDateTime.now();
      System.out.println("DT:"+dt);
      
      
      int dd1 = dt.getDayOfMonth();
      int mm1 = dt.getMonthValue();
      int yy1 = dt.getYear();
      
      
      int h1 = dt.getHour();
      int m1 = dt.getMinute();
      int s1 = dt.getSecond();
      int n1 = dt.getNano();
      
      LocalDateTime afterSixYears = dt.plusYears(4);
      
      System.out.println("After four year:"+afterSixYears);
      
      System.out.println(dd1+".."+mm1+".."+yy1);
      System.out.printf("%d-%d-%d",dd1,mm1,yy1);
      System.out.println();
      System.out.printf("%d:%d:%d:%d",h1,m1,s1,n1);
      
      System.out.println();
      
      LocalDateTime dt1 = LocalDateTime.of(1988, Month.JULY,12,11,45,2,3444444);
      
      System.out.println("DT:"+dt1);
      
		
	}

}
