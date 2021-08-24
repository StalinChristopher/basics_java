package com.yml.functionalbasicsjava;

public class Distance {
	
	public static void distance(String args[]) {
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		double distance = calculateDistance(x, y);
		
		System.out.println("Distance: "+String.format("%.6f",distance));
		
	}
	
	static double calculateDistance(int x,int y) {
		return Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
	}
	
}
