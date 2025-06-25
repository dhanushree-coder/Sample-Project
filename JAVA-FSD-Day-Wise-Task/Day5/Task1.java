package Day5;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        // Create an ArrayList of students
        ArrayList<String> students = new ArrayList<>();

        // Add student names
        students.add("Dhanush");
        students.add("Madhan");
        students.add("Prem");
        students.add("Tamil");

        // Display students using Iterator
        System.out.println("--- Student List ---");
        Iterator<String> itr = students.iterator();

        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }
    }
}
