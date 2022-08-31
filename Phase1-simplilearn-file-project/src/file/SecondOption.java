package file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SecondOption {
		
	public void searchFile(String filename) {
		
        File file = new File("C:\\Users\\User\\Test\\"+filename);
        char[] array = new char[200];
		
        try {
		     // case sensitive file name check 
		     if ( file.exists() && file.getCanonicalFile().getName().equals(file.getName())) {
		    	 FileReader input = new FileReader(file.getPath());
					
				 input.read(array);
				 System.out.println("File is found");
				 System.out.println("Data in the file:");
				 System.out.println(array);
				 input.close();		         

		     } else {
			     System.out.println("File not found");
		     }
	} catch(Exception e) {
		e.printStackTrace();
	}
  }

	public void deleteFile(String filename) {
		
        File file = new File("C:\\Users\\User\\Test\\"+filename);
		
		try {
		// case sensitive file name check 
		if ( file.getCanonicalFile().getName().equals(file.getName())) {
		    boolean value = file.delete();
              
		    if(value) {
			    System.out.println("The File is deleted");
	     	} else {
	     		System.out.println("The File is not deleted");
	     	}
	    	
		}
		else { 
	     	System.out.println("File not found");
	    }
		} catch(Exception e ) {
			e.printStackTrace();
		}
	}
		

	public void addFile(String filename) {
		//create a file object for the current location
				File file = new File("C:\\Users\\User\\Test\\"+filename);
				
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
