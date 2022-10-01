package Simplilearn.examples;

public class Casting {

	public static void main(String[] args) {
		
		// automatic promotion - widening 
		int i1 = 56;
		long l1 = i1; // int is automatically promoted to long
		System.out.println("The result is "+l1);
		
		//Narrowing
		long l2 = 56L;
//		int i2 = l2; gives compile time error
		int i2 = (int)l2;
		System.out.println("The result is "+i2);
		
		double d1 = 3.9999999;
		int i3 =  (int)d1;
		System.out.println("The result is "+i3);
		
		int i4 = 129;
		byte b4 = (byte) i4;
		System.out.println("The result is "+b4 + " " + Math.pow(2, 7));
		
		
		
		
	}

}
