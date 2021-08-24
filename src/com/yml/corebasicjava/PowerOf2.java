package com.yml.corebasicjava;
import java.util.*;
import java.io.*;
public class PowerOf2 {
	
	public static void power(String args[]) {
		int powerValue = Integer.parseInt(args[0]);
		if(powerValue<0 || powerValue>31) {
			print("Power vlaue should be between 0 and 31");
			System.exit(0);
		}
		for (int i=0;i<powerValue;i++) {
			print("2^"+i+" = "+(int)Math.pow(2, i));
		}
	}
	
	static void print(String message) {
		PrintWriter printWriter = new PrintWriter(System.out);
		printWriter.println(message);
		printWriter.flush();
	}
}
