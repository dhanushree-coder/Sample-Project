package Day4;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class Task2 {
	    public static void main(String[] args) {
	        try {
	            File file = new File("sample.txt"); // file in your project folder
	            Scanner reader = new Scanner(file);

	            System.out.println("--- File Content ---");
	            while (reader.hasNextLine()) {
	                String line = reader.nextLine();
	                System.out.println(line);
	            }

	            reader.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: File not found.");
	        }
	    }
	}


