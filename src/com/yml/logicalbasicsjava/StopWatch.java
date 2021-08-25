package com.yml.logicalbasicsjava;

import java.util.*;

public class StopWatch {
	public static long startTime,stopTime;
	//start the timer
	public static void startTimer()
	{
		startTime = System.currentTimeMillis();
		System.out.println("Stop watch started");
		System.out.println("Start time = "+startTime+"ms");
	}
	
	//stop the timer
	public static void stopTimer()
	{
		stopTime=System.currentTimeMillis();
		System.out.println("Stop watch stopped");
		System.out.println("Stop time = "+stopTime+ "ms");
	}
	
	//calculate the time elapsed 
	public static long getElapsedTime()
	{
		return stopTime-startTime;
	}
	//main
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Press 1 to start");
			int n=sc.nextInt();
			if(n==1)
				startTimer();
			System.out.println("Press 2 to stop");
			n=sc.nextInt();
			if(n==2)
			{
				stopTimer();
				System.out.println("The elapsed time between start and end is "+getElapsedTime()+"ms");
			}
			sc.close();
		}

}
