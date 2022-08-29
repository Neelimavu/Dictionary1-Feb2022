package wordMeaning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		String text = doesFileExist("C:\\Users\\neeli\\OneDrive\\Documents\\Dictionary.txt");
		System.out.println(text);
		
	}
	
	public static String doesFileExist(String file) {
		String text = "";
		try {
			Scanner s = new Scanner(new File(file));
			while(s.hasNextLine()) {
				System.out.println(s.nextLine());;
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
		
		return text;
		
	}

}
