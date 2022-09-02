package file;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;


public class FirstOption {

	
	public void list() {
      
        try {
        	
		File dirPath = new File("C:\\Users\\User\\Test");	

		// check if it is a file or folder
		FileFilter fileFilter = new FileFilter()
		{
			 public boolean accept(File dir) {          
		            if (dir.isFile()) {
		               return true;
                    } else {
		               return false;
		            }
		         }
			 
		};
		
		File [] contents = dirPath.listFiles(fileFilter);
	
		if (contents.length != 0 ) {
		//Sort the files in ascending order
		Arrays.sort(contents);
		
		// print the list of files
		 for (File file : contents)
	        {
	            System.out.println(file.getName());
	        }
		}else {
        	System.out.println("Directory does not have any files");
        }
        
        } catch(Exception e) {
        	System.out.println("Directory not found");
        }
      } 
	}
			
		

