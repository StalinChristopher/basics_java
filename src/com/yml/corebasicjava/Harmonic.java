package com.yml.corebasicjava;

import java.util.*;

public class Harmonic {
	public static void harmonicMethod() {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Please enter the value of n");
		int n = scanner.nextInt();
		while(n==0) {
			System.out.println("n should not be 0");
			n = scanner.nextInt();
		}
		double result = 0;
		
		for(int i=1;i<=n;i++) {
			result+=(double)1/i;
		}
		
		System.out.printf("\nnth Harmonic number is : %.3f",result);
		scanner.close();
	}
}
