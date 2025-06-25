package Day3;

public class Task3 {
	
	

	    // sum method for integers
	    public int sum(int a, int b) {
	        return a + b;
	    }

	    // sum method for doubles
	    public double sum(double a, double b) {
	        return a + b;
	    }

	    // main method to test both
	    public static void main(String[] args) {
	        Task3 obj = new Task3();

	        int intResult = obj.sum(10, 20);
	        double doubleResult = obj.sum(5.5, 4.3);

	        System.out.println("Sum of integers: " + intResult);
	        System.out.println("Sum of doubles: " + doubleResult);
	    }
	}

	
	


