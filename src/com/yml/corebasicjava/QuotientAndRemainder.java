package com.yml.corebasicjava;
import java.util.*;

public class QuotientAndRemainder {
	public static void quotientRemainderMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of two numbers of the form a/b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(b<=0) {
			System.out.println("Please enter a positive number for b");
			b = sc.nextInt();
		}
		
		int quotient = a/b;
		int remainder = a%b;
		
		System.out.println("Quotient : "+quotient);
		System.out.println("Remainder : "+remainder);
		
	}
}
