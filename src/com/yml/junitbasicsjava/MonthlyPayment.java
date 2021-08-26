package com.yml.junitbasicsjava;
import java.util.*;

public class MonthlyPayment {
	
	public static void run(String[] args) {
		double principal = Double.parseDouble(args[0]);
		int year = Integer.parseInt(args[1]);
		double rate = Double.parseDouble(args[2]);

		double monthlyPayment = Util.monthlyPayment(principal, year, rate);

		System.out.printf("Monthly payment to be paid : %.2f",monthlyPayment);
	}
}
