package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DeclareException {

	//declare rule
	public static void findFile() throws IOException{
		File newfile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newfile);
		
	}
	
	//handle rule
	
	public static void main(String[] args) {
		try {
			findFile();
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
