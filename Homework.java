package com.ngen.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Homework {
	public static void main(String args[]) throws IOException{
		
		//Problem 8: Print Fibonacci series from 0 to 10 numbers////////////////
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int fib = Integer.parseInt(br.readLine());
		String newLine = System.getProperty("line.separator");
		int num1 = 0, num2 = 1, num3, fib= 7;// fib is what the Fibonacci series is manully set up to.    
		System.out.print(newLine+"Problem 8: Print Fibonacci series from 0 to 10 numbers");
		System.out.print(newLine+num1+" "+num2);//Manually print 0 & 1.    
		//For loop starts from 2 because 0 and 1 are already printed 
		
		for(int i = 2; i < fib; ++i)  
		{    
			num3 = num1 + num2;    
			System.out.print(" "+num3); 
			//System.out.println(" "); 
			//Swap numbers so previous number is added to the next.
			num1 = num2;    
			num2 = num3;    
		}
	
		//Problem 9: Prime numbers between 1 and 10////////////////
		int i = 0, num = 0;
		System.out.print(newLine+newLine+"Problem 9: Prime numbers between 1 and 10");
		for (i = 1; i <= 10; i++)         
		{ 		  	  
			int counter = 0; 	  
			for(num = i; num >= 1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
			if (counter==2)
			{
				
				//Appended the Prime number to the String
				//int primeNumbers = i;
				
				System.out.println(newLine+"Prime numbers from 1 to 10 are: "+i);
				
			}	
		}
		
		//Problem 10: Program to print system date/////////////////////////
		int day, month, year;
		//Called a built in method from java lib
		GregorianCalendar date = new GregorianCalendar();

		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);
		System.out.print(newLine+"Problem 10: Program to print system date");
		System.out.println(newLine+"Today's date is: "+(month+1)+"-"+day+"-"+year);
		
		//Problem 11: Swap two number without a 3rd Variable///////////////
		int a=2, b=5;
		System.out.print(newLine+"Problem 11: Swap two number without a 3rd Variable");
		System.out.println(newLine+"Before swap a is: "+a);
		System.out.println("Before swap b is: "+b);
		b = b-a;
		a = a+b;
		b = a-b;
		System.out.println("After swap a is: " +a+ " and b is: "+b); 
		
		
		//Problem 12: Find the mid given three numbers
		int x=5, y=13, z=11;
		//Since we have 3 number, we have 6 possible permutations/outcomes
		if (x > y) {
			if (y > z) {
				System.out.print("The middle number is: "+y);
			} else if (x> z) {
				System.out.print("The middle number is: "+z);
			} else {
				System.out.print("The middle number is: "+x);
			}
		} else {
			if (x > z) {
				System.out.print("The middle number is: "+x);
			} else if (y > z) {
				System.out.print("The middle number is: "+z);
			} else {
				System.out.print("The middle number is: "+y);
			}
		}
		
		//Problem 12: Find the mid given three numbers
	
	
	}
}
