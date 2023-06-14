package com.acts;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

class Javacode
{
	public static void main (String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter t :");
		int num1=sc.nextInt();
		while(num1-->0)
		{
			System.out.print("Enter N :");
		    int num2=sc.nextInt();
		    System.out.print("Enter K :");
		    int num3=sc.nextInt();

		    int[] w=new int[num2];
		    
		    
		    long num4=0;
		    long num5=0;
		    for(int i=0;i<num2;i++)
		    {
		    	
		        w[i]=sc.nextInt();
		    }
		    Arrays.sort(w);
		    
		    int num6=Math.min(num3,num2-num3);
		    for(int i=0;i<num6;i++)
		    {
		        
		        num4+=w[i];
		                
		    }      
		    for(int i=num6;i<num2;i++)
		    {
		        
		        num5+=w[i];
		        
		    }
		    long result=num5-num4;
		    System.out.println(result);
		}
	}
}
