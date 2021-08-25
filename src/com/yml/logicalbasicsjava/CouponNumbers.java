package com.yml.logicalbasicsjava;
import java.util.*;

public class CouponNumbers {
	public static Random r = new Random();  
	public static int n;
	public static ArrayList<Integer> dis_arr=new ArrayList<>(); 
	
	//generates random number
    public static int  randomNumber()
    {
    	return r.nextInt(10);
    }
    
    //check if the random number generated is present in the array and remove it from the array if its present
    public static boolean process(int x)
    {
    	int index = dis_arr.indexOf(x);
    	if(index != -1)
    	{
    		dis_arr.remove(index);
    		return true;
    	}
    	else return false;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
        System.out.println("Enter the "+n+" distinct coupon numbers");
        
        //add the distinct coupon no. to dis_arr
        for(int i=0;i<n;i++)
    	   dis_arr.add(sc.nextInt());
        
        int count=0,rand_number=0;
        while(count<n)
        {
    	   while(true)
    	   {
    		   int x=randomNumber();
    		   //increment count of rand_number
    		   rand_number++;
    		   boolean ps=process(x);
    		   if(ps)
    			   break;
    	   }
    	   count++; 
        }
       System.out.println("Number of random numbers needed to process distinct coupon number is "+rand_number);
       sc.close();
	}

}