package simplilearn.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {

	public static void main(String[] args) {
		//Accept user input
		String s1 = getInput("Enter a numeric value1: ");
		String s2= getInput("Enter a numeric value2: ");
        
		//transform String to double
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		//Addition
		double d3 = d1 + d2;
		System.out.println("The addition result is" + d3);
		
		//Substraction
		double d4 = d1 - d2;
		System.out.println("The subtraction result is"+ d4);
		
		//Multiplication
		double d5 = d1*d2;
		System.out.println("The multiplication result is"+ d5);
		
		//Multiplication
		double d6 = d1/d2;
		System.out.println("The division result is"+ d6);
		
		//Multiplication
	
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		int i3 = i1%i2;
		System.out.println("The modulus result is"+ i3);
				
	}
	
	public static String getInput(String prompt)
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		}
		catch(Exception e){
			return "Error:" + e.getMessage();
		}
		
	}

}


