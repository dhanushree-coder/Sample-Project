package Day3;

import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int[] marks = new int[3]; // marks for 3 subjects

    // Constructor
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Assign marks
    void setMarks(int m1, int m2, int m3) {
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    // Calculate total
    int getTotal() {
        return marks[0] + marks[1] + marks[2];
    }

    // Display result
    void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Total Marks: " + getTotal());
    }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        // Create student
        Student s = new Student(name, roll);

        // Input marks
        System.out.print("Enter marks for Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int m3 = sc.nextInt();

        // Assign and display
        s.setMarks(m1, m2, m3);
        s.displayResult();

        sc.close();
    }
}

	
	
	
	
	
	
	
	
	
	
	
	


