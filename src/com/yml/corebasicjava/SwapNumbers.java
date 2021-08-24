package com.yml.corebasicjava;
import java.util.*;

public class SwapNumbers {
	public static void swap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the two numbers to be swaped");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Before swap");
		System.out.printf("\na : %d\nb : %d\n",a,b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swap");
		System.out.printf("\na : %d\nb : %d\n",a,b);
	}
}
