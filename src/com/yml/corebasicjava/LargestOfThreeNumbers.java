package com.yml.corebasicjava;
import java.util.*;
import java.io.*;

public class LargestOfThreeNumbers {
	public static void largestMethod() {
		System.out.println("Enter the three numbers a,b,c");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is the largerst of three numbers");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is the largerst of three numbers");
		}
		else {
			System.out.println(c+" is the largerst of three numbers");
		}
	}
}
