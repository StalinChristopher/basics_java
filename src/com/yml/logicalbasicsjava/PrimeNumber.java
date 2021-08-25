package com.yml.logicalbasicsjava;
import java.util.*;
import java.io.*;

public class PrimeNumber {
	public static void prime() {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out,true);
		int n;
		int flag=0;
		out.println("Enter the number n");
		n = in.nextInt();
		if(n<=1) {
			flag=1;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			out.println(n+" is a prime number");
		}
		else {
			out.println(n+" is not a prime number");
		}
		
	}
}
