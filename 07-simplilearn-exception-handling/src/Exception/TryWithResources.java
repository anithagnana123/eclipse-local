package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {

		String line;
		try(BufferedReader br = new BufferedReader(new FileReader("doesnotexists.txt"))){
			while ((line = br.readLine()) != null) {
				System.out.println(line);		
			}
		}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}



