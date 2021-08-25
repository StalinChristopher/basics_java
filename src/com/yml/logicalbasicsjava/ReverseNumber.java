package com.yml.logicalbasicsjava;
import java.util.*;
import java.io.*;

public class ReverseNumber {
	
	public static void reverse() {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out,true);
		int n;
		int reverse=0;
		int temp;
		int rem;
		out.println("Enter the number to be reversed");
		n = in.nextInt();
		temp = n;
		while(temp!=0) {
			rem = temp%10;
			reverse = reverse*10 + rem;
			temp = temp/10;
		}
		out.println("Reversed number : "+reverse);
	}
}
