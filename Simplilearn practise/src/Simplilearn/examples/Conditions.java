package Simplilearn.examples;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a  month number: ");
		int m = s.nextInt();
		
		if( m >= 1 && m <= 3) {
			System.out.println("You are in 1st Quarter");
		} else if (m >= 4 && m <= 6){
			System.out.println("You are in 2nd Quarter");
		} else  if (m >= 7 && m <= 12) {
			System.out.println("You are not in the first half of the year");
		} else {
			System.out.println("Invalid month..");
		}
			
		

	}

}
