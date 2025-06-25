package Day1;

import java.util.Scanner;

public class Task2 {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the principle amount: ");
		double p= sc.nextDouble();                       //principle amount
		
		


		System.out.println("Enter the  no.of years: ");
		double n= sc.nextDouble();                       //year
		
		

		System.out.println("Enter the rate of interest: ");
		double r= sc.nextDouble();                       //rate
		
		
		if(p>0 && n>0 && r>0) {
			
		    double percentage =  ((p*n*r) / 100);
		    System.out.println("The amount of simple interest is : " +percentage);
		  }
		
		
		
		
		
		
		
	}

}
