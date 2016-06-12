package com.ngen.day1;

public class Variables {
	public static void main(String args[]){
		
        ////////Problem 1: Add two numbers////////////////////
		int sum, a= 10, b = 20;
		sum = a+b;
		System.out.println("The sum of a+b is: " +sum);
		
        ////////Problem 2: calculate (10 * 2 + 5)/2///////////
		int x=10, y=2, c=5, d=2;
		int result =((x * y + c)/d);
		System.out.println("The result of (10 * 2 + 5)/2 is: " +result);
		
        ///////Problem 3: Print number from 1 to 10./////////
		int z = 10;
		if (z == 10){
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			}
			else{
				System.out.println("Error");
			}
		///////Another way to print using for loop////////// 
		for(int i =10; i>0; i--){
			System.out.println(i);
			}
		}
	}


