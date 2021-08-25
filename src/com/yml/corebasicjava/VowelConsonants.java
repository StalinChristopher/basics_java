package com.yml.corebasicjava;
import java.util.*;

public class VowelConsonants {
	public static void vowelConsonantsMethod() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the character");
		char c = in.next().charAt(0);
		c=Character.toLowerCase(c);
		if( c=='a' || c=='e' || c=='i'|| c=='o' || c=='u') {
			System.out.println(c+" is a vowel");
		}
		else {
			System.out.println(c+" is a consonant");
		}
	}
}
