package com.ngen.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleAnalyzer {

	public static void main(String[] args) throws IOException{
		//Write a program which will tell a user
		//if the given the sided of triangle, whether its a
		//1. Equilateral Triangle
		//2. Scalene Triangle
		//3. Isosceles Triangle 
		//4. Not a triangle
		
		//Problem 7: Program for triangle analyzer///////////////////////////////////////////
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int side1= Integer.parseInt(br.readLine());
		int side2 = Integer.parseInt(br.readLine());
		int side3 = Integer.parseInt(br.readLine());
		
		System.out.println("The three sides entered are: " +side1 +" , "+side2 +" , "+side3);
		////if all side equal one another
		if(side1==side2 && side1==side3){
			System.out.println("The triangle is Equilateral");
		}
		////if none of the sides are equal.
		if(side1!=side2 && side1!=3 && side2!=side3){
			System.out.println("The triangle is Scalene");
		}
		/////if at least two side are equal.
		if((side1==side2 && side2==side3)||(side1==side2 && side1==side3)){
			System.out.println("The triangle is Isosceles");
		}
		////If the sum of two side isn't greater than the third
		int sum1=side1+side2;
		int sum2=side2+side3;
		int sum3=side1+side3;
		if(side3<sum1 || side1<sum2 || side2<sum3){
			System.out.println("Not a triangle");
		}
}
}