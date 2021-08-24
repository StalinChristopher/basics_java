package com.yml.corebasicjava;
import java.util.*;
public class LeapYear {
	
	public static void leapYear() {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the year (4 digits year)");
		year = sc.nextInt();
		if(year<999 || year>9999) {
			System.out.println("Please enter a valid 4 digit number");
			System.exit(0);
		}
		if(((year % 4)==0 && (year%100)!=0)||((year % 400)==0)) {
			System.out.printf("\n%d is a leap year",year);
		}else {
			System.out.printf("\n%d is not a leap year",year);
		}
	}
	
	
}
