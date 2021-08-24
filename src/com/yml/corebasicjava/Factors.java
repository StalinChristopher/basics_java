package com.yml.corebasicjava;

import java.util.Scanner;

public class Factors {
	public static void factorMethod() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the value of n");
		int n = in.nextInt();
		
		while(n<=0) {
			System.out.println("n value should be greater than 0");
			n = in.nextInt();
		}
		
		System.out.println("Factors of "+n+" are ");
		for(int i=2;i<=n;i++) {
			
			while(n%i == 0) {
				System.out.println(i);
				n=n/i;
			}
		}
	}
}
