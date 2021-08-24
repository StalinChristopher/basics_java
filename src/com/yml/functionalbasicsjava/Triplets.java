package com.yml.functionalbasicsjava;

import java.io.PrintWriter;
import java.util.*;

public class Triplets {
	
	public static void triplets() {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		
		out.println("Enter the size of the array");
		int n = in.nextInt();
		
		int[] array = addArray(n);
		Set<String> triplets = calcTriplets(array,n);
		
		out.println("\nNumber of distinct triplets: "+triplets.size());
		out.println("\nDistinct triplets are:\n");
		for(String item: triplets) {
			out.println(item);
		}
		
		
	}
	private static int[] addArray(int n) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		
		int array[] = new int[n];
		
		out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			array[i] = in.nextInt();
		}
		return array;
	}
	
	private static Set<String> calcTriplets(int[] array,int n) {
		PrintWriter out = new PrintWriter(System.out, true);
		int count = 0;
		Set<String> triplets = new HashSet<String>();
		
		for(int i=0;i<n-2;i++)
			for(int j=i+1;j<n-1;j++)
				for(int k=j+1;k<n;k++) {
					if((array[i]+array[j]+array[k]) == 0) {
						triplets.add("["+array[i]+" "+array[j]+" "+array[k]+"]");
						count++;
					}
				}
		return triplets;
	}
	
}