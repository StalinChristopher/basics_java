package com.yml.logicalbasicsjava;
import java.util.*;
import java.io.*;

public class PerfectNumber {
	
	public static void perfectNum() {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out,true);
		int n;
		int sum = 0;
		
		out.println("Please enter the value of n");
		n = in.nextInt();
		
		for(int i = 1;i <= n/2; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			out.println(n+" is a perfect number");
		}
		else {
			out.println(n+" is not a perfect number");
		}
	}
}
