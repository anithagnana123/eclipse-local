package file;

import java.util.Scanner;

public class TestFile {


	public void mainMenu() {
		//Main menu
		System.out.println("Welcome");
		System.out.println("***********************");
		System.out.println("File Handling system");   // Application Name
		System.out.println("Anitha Gnanasekaran");    // Developer name
		System.out.println("***********************");
		System.out.println("Menu");
		System.out.println("1. List the files in the directory");
		System.out.println("2. File Operations");
		System.out.println("3. Exit");
		System.out.println("Select an option: ");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
		switch ( i ) {
		   case 1:
			   FirstOption opt1 = new FirstOption();
			   opt1.list();
			   break;
		   case 2:
			   subMenu();
			   break;
		   case 3:
			   break;
		}			
		
	}
	
	public void subMenu() {
		System.out.println("*******Sub Menu*********");
		System.out.println("1. Add a file");
		System.out.println("2. Delete a file");
        System.out.println("3. Search a file");
        System.out.println("4. Go to Main Menu");
        System.out.println("Select an option: ");
        
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
		SecondOption opt2 = new SecondOption();
		Scanner s1 = new Scanner(System.in);
		
		switch ( j ) {
		case 1 :
			// Add a file
			System.out.println("Enter the filename to be added: ");
			String addFname  = s1.nextLine();
			opt2.addFile(addFname);
			break;
		case 2 :
			// Delete a file
			System.out.println("Enter the filename to be deleted: ");		
			String fname  = s1.nextLine();
			opt2.deleteFile(fname);
			break;
		case 3 :	
			// Search a file
			System.out.println("Enter the filename to be searched: ");
			String searchFname  = s1.nextLine();
		    opt2.searchFile(searchFname);
		    break;
		case 4 :
		   // Return to the Main menu
		   mainMenu();
		   break;
		
		}
		      
	}

	
	public static void main(String[] args) {
		
		TestFile t = new TestFile();
		t.mainMenu();
	
		   
	}

}
