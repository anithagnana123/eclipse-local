package Demo;

public class Test1 {

	// instance variables
	 String name;
	 int age;
	   
	// method  
	public void Test1() {
	   name = "Chris";
       age  = 32;
	   }
	
	
	public static void main(String[] args) {
	  Test1 t1 = new Test1();
	  Test1 t2 = new Test1();
	  
	  t1.name = "Pratt";
	  t1.age = 5;
	  
	  t1 =t2;
	  System.out.println(t1.name + t1.age);
	  System.out.println(t2.name + t2.age);
	  
	  

	}

}
