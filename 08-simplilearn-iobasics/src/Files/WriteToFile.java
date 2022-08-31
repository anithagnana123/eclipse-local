package Files;

import java.io.FileWriter;

public class WriteToFile {

	public static void main(String[] args) {
		
		String data  = "This needs to be written to the file";
		try {
			FileWriter file = new FileWriter("output.txt");
			
			file.write(data);
			
			System.out.println("Data is written to the file");
			file.close();
			
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
