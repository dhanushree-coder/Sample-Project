package Day3;


	
	// Base class
	class Person {
	    String name;
	    int age;

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	// Derived class
	class Employee extends Person {
	    double basicSalary;
	    double hra;
	    double da;

	    Employee(String name, int age, double basicSalary) {
	        super(name, age);
	        this.basicSalary = basicSalary;
	        this.hra = 0.2 * basicSalary;
	        this.da = 0.1 * basicSalary;
	    }

	    double calculateSalary() {
	        return basicSalary + hra + da;
	    }

	    void displayEmployeeInfo() {
	        displayInfo(); // from Person
	        System.out.println("Basic Salary: ₹" + basicSalary);
	        System.out.println("HRA: ₹" + hra);
	        System.out.println("DA: ₹" + da);
	        System.out.println("Total Salary: ₹" + calculateSalary());
	    }
	}

	
	public class Task2 {
	    public static void main(String[] args) {
	        Employee emp = new Employee("Dhanu", 25, 20000);
	        emp.displayEmployeeInfo();
	    }
	}

	
	
	


