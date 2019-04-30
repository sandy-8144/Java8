package com.programming.java8.dataandtime;

import java.time.*;

public class ZoneClass {

	public static void main(String[] args) {
		
		ZoneId id = ZoneId.systemDefault();
		
		System.out.println(id);
		
		ZoneId id1 = ZoneId.of("America/Phoenix");
		ZonedDateTime dt = ZonedDateTime.now(id1);
		
		System.out.println(dt);

	}

}
