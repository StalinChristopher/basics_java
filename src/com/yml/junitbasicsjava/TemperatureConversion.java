package com.yml.junitbasicsjava;
import java.util.*;

public class TemperatureConversion {

	public static void run() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Choose the Temperature type\n1. Celsius\n2. Farenheit");
		int choice = in.nextInt();

		while (choice <= 0 || choice >= 3) {
			System.out.println("Invalid Option");
			choice = in.nextInt();
		}

		System.out.println("Enter the temperature in selected choice");
		double temp = in.nextDouble();

		double afterConversion = 0;
		char tempType = ' ';
		switch (choice) {
		case 1:
			tempType = 'C';
			break;
		case 2:
			tempType = 'F';
		}
		afterConversion = Util.temperatureConversion(temp, tempType);
		if (tempType == 'C')
			System.out.println("Temperature in Farenheit: " + String.format("%.2f", afterConversion));
		else
			System.out.println("Temperature in Celsius: " + String.format("%.2f", afterConversion));
	}
}
