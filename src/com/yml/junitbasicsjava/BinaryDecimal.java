package com.yml.junitbasicsjava;

import java.util.*;

public class BinaryDecimal {

	public static void run() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the decimal number to be converted to binary");
		int num = in.nextInt();
		while (num < 0) {
			System.out.println("Please enter a positive number");
			num = in.nextInt();
		}
		Util.toBinary(num);
	}

}
