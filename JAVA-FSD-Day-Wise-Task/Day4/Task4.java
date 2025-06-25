package Day4;

import java.io.*;
import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {
        try {
            // Step 1: Read from marks.txt
            File inputFile = new File("marks.txt");
            Scanner reader = new Scanner(inputFile);

            // Step 2: Prepare results.txt to write
            BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt"));

            // Step 3: Process each student
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(" ");

                if (parts.length == 4) {
                    String name = parts[0];
                    int m1 = Integer.parseInt(parts[1]);
                    int m2 = Integer.parseInt(parts[2]);
                    int m3 = Integer.parseInt(parts[3]);

                    int total = m1 + m2 + m3;
                    double average = total / 3.0;

                    writer.write(name + " Total: " + total + " Average: " + average);
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();
            System.out.println("Results written to results.txt");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

