 	package Simplilearn.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {

	public static void main (String[] args) {
		
		// get input from user
		String s1 = getInput("Enter a numeric value: "); 
		String s2 = getInput("Enter a numeric value: ");
		
		// convert String into double
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		//Addition
		double result = d1 + d2;
		System.out.println("Addition: " + result);
		
		//Subtraction
		result = d1 - d2;
		System.out.println("Subtraction: " + result );
		
		//Multiplication
		result = d1 * d2;
		System.out.println("Multiplication: " + result );
	
		//Division
		result = d1 / d2;
		System.out.println("Division: " + result );
		
		//Modulus
		result = d1 % d2;
		System.out.println("Modulus: " + result );
	}
	
	
	public static String getInput(String prompt) {
		// read input and convert byte stream  -> character stream -> String
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(prompt);
		System.out.flush();
		
		try {
			// return input String
			return stdin.readLine();
		}
		catch(Exception e) {
			return  e.getMessage();
		}
	}
	
	
}
