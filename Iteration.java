package com.ngen.day2;

public class Iteration {
	
	public static void main(String args[]){

	///Problem 4: Power value of a given number and power./////////////////////////
	int num = 2, raised = 3, pow = 1;	
	for(int i=1; i<=raised;i++){
		pow = pow*num;
	}
	System.out.println("The value of " +num +" raised to the power of " +raised +" is: " +pow); 
   
	///Problem 5: Program to get the factorial of a number//////////////////////
	int number = 5;
	int factorial = 0;
	///for loop iterates from 1 to the value of given number
	for(int i=1; i<=number;i++){
		////factorial is equal to the number times by it self until 1.
		factorial = number*i;
		}
	System.out.println("The factorial of " +number +" is: " +factorial); 
	}
}

