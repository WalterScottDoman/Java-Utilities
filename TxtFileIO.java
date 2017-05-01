package utilities;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class TxtFileIO {
	/**
	 * takes a txt file name as a string and returns the file as an Iterable<String>
	 * if you have a text file named words.txt in a directory called resources
	 * the string you want to pass would be "resources/words.txt"
	 * @return returns the context of a text file as an Iterable<String>
	 */
	public static Iterable<String> byLine(String fileName){
		ArrayList<String> fileLines = new ArrayList<>();
		 URL path = ClassLoader.getSystemResource(fileName);
         if(path==null) {
             // print error if file not found
             System.err.println(fileName + " Not Found");
         }
         
         try {
             Scanner input = new Scanner(new File(path.toURI()));
             while (input.hasNextLine()){
                 fileLines.add(input.nextLine());
             }
             input.close();
         } catch (Exception Ex){
             System.err.println(Ex);
         }
		return fileLines;	
	}
	
	/**
	 * to do write a method for writing txt files.
	 */
}
