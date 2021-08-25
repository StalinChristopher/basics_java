package com.yml.logicalbasicsjava;

import java.util.*;

public class CouponNumbers {
	public static Random r = new Random();
	public static int n;
	public static ArrayList<Integer> dis_arr = new ArrayList<>();

	// generates random number
	public static int randomNumber() {
		return r.nextInt(10);
	}
	
	//
	public static boolean process(int x) {
		int index = dis_arr.indexOf(x);
		if (index != -1) {
			return false;
		} else
			return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n = sc.nextInt();
		System.out.println("Enter the " + n + " distinct coupon numbers");

		// add the distinct coupon no. to dis_arr
		for (int i = 0; i < n; i++)
			dis_arr.add(sc.nextInt());

		int count = 0;
		while (true) {
			count++;
			int x = randomNumber();
			boolean ps = process(x);
			if (ps)
			{
				System.out.println("Distinct coupon generated: "+x);
				break;
			}
			
		}

		System.out.println("Number of random numbers needed to generate distinct coupon number is " +count);
		sc.close();
	}

}