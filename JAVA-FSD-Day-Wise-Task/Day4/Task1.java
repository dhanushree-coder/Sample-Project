package Day4;

import java.util.Scanner;

public class Task1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter num1: ");
	            int numerator = sc.nextInt();

	            System.out.print("Enter num2: ");
	            int denominator = sc.nextInt();

	            int result = numerator / denominator;  // may throw exception
	            System.out.println("Result: " + result);

	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        }

	        sc.close();
	    }
	}


