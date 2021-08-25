package com.yml.logicalbasicsjava;
import java.util.*;
import java.io.*;

public class Fibonacci {
	
	public static void fibonacci() {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out,true);
		int n;
		int n1 = 0, n2 = 1;
		int n3;
		
		out.println("Please enter the value of n");
		n = in.nextInt();
		out.println("The first "+n+" numbers of fibonacci numbers are: ");
		out.print(n1+" "+n2+" ");
		
		for(int i=2;i<n;i++)
		{
			n3 = n1 + n2;
			out.printf(n3+" ");
			n1 = n2;
			n2 = n3;
		}
		out.flush();
		in.close();
	}
}
