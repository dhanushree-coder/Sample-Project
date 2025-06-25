package Day1;

import java.util.Scanner;




public class Task4 {
	
	public void arithmetic() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number 1: ");
		double a= sc.nextDouble();
		
		System.out.println("Enter your number 22: ");
		double b= sc.nextDouble();
		
		
		System.out.println("Addition + ");
		System.out.println("Subtract - ");
		System.out.println("Multiplication * ");
		System.out.println("Division / ");
		System.out.println("Modulos % ");
		System.out.println("Please use operators");
		
		char operator = sc.next().charAt(0);
		double result;
		
		switch(operator) {
		
		case '+':
			result= a+b;
			System.out.println("the result is: " +result);
			break;
		
			
		case '-':
			result= a-b;
			System.out.println("the result is: " +result);
			break;	
			
		case '*':
			result= a*b;
			System.out.println("the result is: " +result);
			break;	
			
		case '/':
			if(b != 0) 
			{
				result=a/b;
				System.out.println("the result is: " +result);
				}
			else {
				System.out.println("Not divisible by zero");
			}
			
		case '%':
			result=a%b;
			System.out.println("the result is: " +result);
			
			break;

		default:	
			
		System.out.println("Invalid operator");	
		
			
			
		}
		
	
	
	}
	
	public static void main(String[] args) {
		
		Task4 calculator=new Task4();
		calculator.arithmetic();
		
		
		
		
	}
		
		
		
		
		
		
		
}
