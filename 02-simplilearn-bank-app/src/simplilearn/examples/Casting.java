package simplilearn.examples;

public class Casting {

	public static void main(String[] args) {
		
	//int to long	
      int i1 =56;
      long l1 = i1;
      System.out.println("The result is "+l1);
		
    //long to int
      long l2 =56L;
      int i2 = (int)l2;
      System.out.println("The result is "+i2);
    
    //double to int
      double d1 =324.323423;
      int i3 = (int)d1;
      System.out.println("The result is "+i3);
    
    
    //int to byte
      int i4 =126;
      byte b1  = (byte)i4;
      System.out.println("The result is "+b1);
		
    
    
    //long to float
      long l3 = 78L;
      float f1 = (float)l3;
      System.out.println("The result is "+f1);
    
    
	}

}
 