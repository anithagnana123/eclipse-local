package Files;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) {
		//create a file object for the current location
		File file = new File("output.txt");
		
		try {
			boolean value = file.createNewFile();
			if(value) {
				System.out.println("The new file is created");
			}
			else {
				System.out.println("The file already exists");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
