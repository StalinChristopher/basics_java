package com.yml.functionalbasicsjava;

import java.util.Scanner;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TwoDArray {
	public static void arrayMethod() {
		int rows;
		int columns;
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out),true);
		out.println("Enter the number of rows");
		rows = in.nextInt();
		out.println("Enter the number of columns");
		columns = in.nextInt();
		
		int array[][] = new int[rows][columns];
		out.println("Enter the array elements");
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
				array[i][j] = in.nextInt();
		out.println("The elements of array are: \n");
		printArray(array,rows,columns);
		
	}
	
	
	private static void printArray(int[][] array,int rows,int columns) {
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out),true);
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++)
				out.print(array[i][j]+" ");
			out.println();
		}
	}

}
