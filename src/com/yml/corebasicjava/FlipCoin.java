package com.yml.corebasicjava;
import java.util.*;

public class FlipCoin {
	
	public static void flipCoin() {
		int n; //number of times to flip a coin
		double ranValue;
		double headCount=0;
		double tailCount=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of times you want to flip coin");
		n = sc.nextInt();
		if(n<=0) {
			System.out.println("Please enter a valid number");
			System.exit(0);
		}
		for(int i=0;i<n;i++) {
			System.out.printf("\nFlipping the coin\n");
			ranValue = Math.random();
			if(ranValue<0.5) {
				tailCount++;
				System.out.printf("Head\n");
			}
			else {
				headCount++;
				System.out.println("Tail\n");
			}
			
		}
		//Calculating percentage
		double headPercent = (headCount/n)*100;
		double tailPercent = (tailCount/n)*100;
		System.out.printf("\nPercentage of heads: %.2f",headPercent);
		System.out.printf("\nPercentage of tails: %.2f",tailPercent);
		
	}
	
}
