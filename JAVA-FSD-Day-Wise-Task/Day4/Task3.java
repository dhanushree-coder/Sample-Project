package Day4;

    import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;

	public class Task3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

	            System.out.println("Enter 3 lines to write to file:");
	            for (int i = 1; i <= 3; i++) {
	                System.out.print("Line " + i + ": ");
	                String line = sc.nextLine();
	                writer.write(line);
	                writer.newLine();  // move to next line in file
	            }

	            writer.close();
	            System.out.println("Lines written to output.txt");

	        } catch (IOException e) {
	            System.out.println("Error writing to file.");
	        }

	        sc.close();
	    }
	}

	
	
	


