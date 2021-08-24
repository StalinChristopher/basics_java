package com.yml.corebasicjava;
import java.util.*;
import java.io.*;

public class EvenOdd {
	public static void evenOddMethod() {
		Scanner scanner = new Scanner(System.in);
		print("Enter the number to be checked");
		int n = scanner.nextInt();
		if(n%2==0)
			print("Number "+n+" is even");
		else
			print("Number "+n+" is odd");
		
	}
	
	private static void print(String msg) {
		PrintWriter out = new PrintWriter(System.out);
		out.println(msg);
		out.flush();
	}
}
