package Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class DeserializeDate {
	
	public DeserializeDate() {
		
		Date d = null;
		
		try {
			
			FileInputStream f = new FileInputStream("date.ser");
			ObjectInputStream s = new ObjectInputStream(f);
			
			d = (Date) s.readObject();
			s.close();
		}
		catch(Exception e ) {
			e.printStackTrace();
			
		}

		System.out.println(d);
	}

	public static void main(String[] args) {
		new DeserializeDate();

	}
}
