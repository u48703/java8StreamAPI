package com.sitstech.streamApi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App 
{
    public static void main( String[] args )
    {
    	// we can for mat the date and  find dates from different time zones etc all those things have inbuilt methods
    	LocalDate d= LocalDate.now();
    	System.out.println("date is = "+ d);
    	LocalTime t = LocalTime.now();
    	System.out.println("time = "+t);
    	LocalDateTime dt= LocalDateTime.now();
    	System.out.println("LocalDateTime = "+dt);
    	Instant i = Instant.now();
    	System.out.println("mechine redable  Gmt DateTime = "+i);
    	
    }
}
