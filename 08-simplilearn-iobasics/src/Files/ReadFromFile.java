package Files;

import java.io.FileReader;

public class ReadFromFile {

	public static void main(String[] args) {
		char[] array = new char[20];
		try {
			FileReader input = new FileReader("input.txt");
			
			input.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);
			input.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
