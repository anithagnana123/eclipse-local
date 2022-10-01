package Simplilearn.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Switch {

	public static void main(String[] args) {
		
		String s1 = getInput("Enter a number between 1 and 12 :");
		
		int month = Integer.parseInt(s1);
		
		switch(month) {
		
		case 1: 
			System.out.println("Month is January");
		    break;	
		case 2: 
			System.out.println("Month is February");
		    break;	
		case 3: 
			System.out.println("Month is March");
		    break;	
		case 4: 
			System.out.println("Month is April");
		    break;	
		default: 
			System.out.println("Please chose another month");
		    break;	
		}
		
	}
	
	private static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		} catch(Exception e) {
			return  e.getMessage();
		}
		
	}

}
