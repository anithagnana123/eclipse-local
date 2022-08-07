package simplilearn.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwitchWithInts {

	public static void main(String[] args) {
		String input = getInput("Enter a number between 1 and 12");
		int i = Integer.parseInt(input);
		
		System.out.println(i);
		
		switch(i)
		{
		case 1:
		System.out.println("Month is January");
		break;
		case 2:
		System.out.println("Month is February");
		break;
		default:
		System.out.println("It is some other month");
		break;
		
		}
	}

	private static String getInput(String prompt) {
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
	
	


