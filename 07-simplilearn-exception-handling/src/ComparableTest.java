
import java.util.*;

public class ComparableTest {

	public static void main(String[] args) {
		
		String s1 = null;
		System.out.println(s1);
		
		TreeSet set = new TreeSet();
		set.add(new Student("Tom","Cruise",101,9.8));
		set.add(new Student("Chris","Pratt", 102 , 3.4));
		set.add(new Student("Kate","Winslet", 103, 7.5));

		// Sort based on the GPA of the students. 
		// Sorting logic written in Student class compareTo()
		//convert collection(TreeSet) to an array as we are not able to print it directly in this case
		
		Object[] stdArray = set.toArray();
		Student s;
		
		for(Object eachElement : stdArray)
		{
			s = (Student) eachElement;
			System.out.printf("Name = %s %s ID = %d GPA = %.1f\n ", s.firstName(),s.lastName(),s.studentID(),s.GPA());
		}

		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("one");
		set1.add("two");
		set1.add("four");
		set1.add("three");
		
/*		Iterator<String> itr=set1.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  */
		System.out.println(set1);
		
		
	}

}
