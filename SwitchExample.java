package com.ngen.day2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchExample {
	public static void main(String args[]) throws IOException{
		
		//Problem 6: Program to print month using switch case
		//Reads value type by user and stores it in br.
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int monthNum= Integer.parseInt(br.readLine());
		System.out.println("The number user entered is: " +monthNum);
		switch (monthNum){
		case 1: System.out.println("January");
				break;
		case 2: System.out.println("February");
				break;
		default:System.out.println("Invalid");
				break;
		}		
	}
}
