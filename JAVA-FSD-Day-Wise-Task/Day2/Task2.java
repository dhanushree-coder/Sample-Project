package Day2;

import java.util.Scanner;

public class Task2 {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the sentence: ");
		String str=sc.nextLine().toLowerCase();
		
		int vowels=0 , consonants=0;
		
		for(int i=0;i<str.length();i++)
		{
			
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				
				if("aeiou" .indexOf(ch)!=-1)
					vowels++;
				else
					consonants++;
				
				
			}
			
			
			
			
			
		}
		
		
		
		System.out.println("The vowels are: "+vowels);
		System.out.println("The consonants are: "  + consonants);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
