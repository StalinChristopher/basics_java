package com.yml.junitbasicsjava;
import java.util.*;

public class VendingMachine {
	public static Map<Integer,Integer> Notes = new HashMap<Integer,Integer>();
	public static int count = 0;
	
	public static void returnChange(int amount) {

		if(amount == 0)
			return ;

		count++;
		if(amount/1000 > 0){
			Notes.put(1000,amount/1000);
			returnChange(amount%1000);
			return;
		}
		if(amount/500 > 0){
			Notes.put(500,amount/500);
			returnChange(amount%500);
			return;
		}
		if(amount/100 > 0){
			Notes.put(100,amount/100);
			returnChange(amount%100);
			return;
		}
		if(amount/50 > 0){
			Notes.put(50,amount/50);
			returnChange(amount%50);
			return;
		}
		if(amount/10 > 0){
			Notes.put(10,amount/10);
			returnChange(amount%10);
			return;
		}
		if(amount/5 > 0){
			Notes.put(5,amount/5);
			returnChange(amount%5);
			return;
		}
		if(amount/2 > 0){
			Notes.put(2,amount/2);
			returnChange(amount%2);
			return;
		}
		if(amount/1 > 0){
			Notes.put(1,amount/1);
			returnChange(amount%1);
			return;
		}
	}
	
	public static void vendingMachine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Change in Rs to be returned by the vending machine");
		int change = sc.nextInt();
		returnChange(change);
		System.out.println("The minimum number of notes needed to give the change are:");
		System.out.println(Notes);
		System.out.println(count);
		sc.close();
	}
}
