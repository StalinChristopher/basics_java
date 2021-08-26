package com.yml.junitbasicsjava;
import java.util.*;

public class SquareRoot {
	
	public static void squareRoot() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a non negative number of which the square root has to be computed");
		int c = in.nextInt();
		double result = Util.sqrt(c);
		System.out.println("Square root of "+c+" is : "+result);
	}
}
