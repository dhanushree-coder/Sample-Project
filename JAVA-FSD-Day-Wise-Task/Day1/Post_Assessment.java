package Day1;

import java.util.Scanner;

public class Post_Assessment {
	
	
	public void GradeMarks() {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your marks:");
	int marks=sc.nextInt();
	
	if(marks>=90 && marks<=100)
	{
	
		System.out.println("Grade is A");
		
	}
	
	else if(marks>=70 && marks< 80)
	{
		System.out.println("Grade is B");
		
	}
	
	else if(marks>=60 && marks< 70)
	{
		System.out.println("Grade is C");
		
	}
	
	else if(marks>=40 && marks< 60)
	{
		System.out.println("Grade is D");
		
	}
	
	else if(marks>=0 && marks< 40)
	{
		System.out.println("Grade is Fail");
		
	}
	
	
	else
	{
	System.out.println("***Invalid operator***");	
		
	}
	
	}
     
	public static void main(String[] args) {
    	  
    	  Post_Assessment result=new Post_Assessment();
    	  result.GradeMarks();
    	  
    	 }
	
	
	
	
	
	
	

}
