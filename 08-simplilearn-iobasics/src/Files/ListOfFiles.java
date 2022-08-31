package Files;

import java.io.File;

public class ListOfFiles {

	public static void main(String[] args) {
		
		File dirPath = new File("C:\\Users");

	    String [] contents = dirPath.list();
		System.out.println("List of files and directories");
		
		for(int i=0; i< contents.length; i++) {
			System.out.println(contents[i]);
		}
		
	}

}
