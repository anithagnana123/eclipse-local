
public class Student implements Comparable{

	// instance variables
	String firstName,lastName;
	int studentID = 0;
	double GPA = 0.0;
	
	//constructor
	public Student(String firstName, String lastName, int studentID, double GPA){
		if(firstName == null||lastName == null||studentID == 0||GPA ==0.0) {
			throw new IllegalArgumentException();
		}
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.studentID = studentID;
	    this.GPA = GPA;
	}
	

	//getter methods
	public String firstName() {
		return firstName;
		}


	public String lastName() {
		return lastName;
		}

	
	public int studentID() {
		return studentID;
		}


	public double GPA() {
		return GPA;
		}


	@Override
	public int compareTo(Object o) {
		double f = GPA - ((Student)o).GPA;
		if  ( f == 0.0 ) 
			return 0; //signifies equal
		else if ( f < 0.0)
			return -1; //negative value signifies less than
		else 
			return 1; //positive value signifies greater than
			}

	
}
