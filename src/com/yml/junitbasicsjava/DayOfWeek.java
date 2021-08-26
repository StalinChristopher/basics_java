package com.yml.junitbasicsjava;

public class DayOfWeek {
	
	public static void run(String args[]) {
		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		
		int day = Util.dayOfWeek(d,m,y);
		
		System.out.println("Day of the given date is "+day);
	}
}
