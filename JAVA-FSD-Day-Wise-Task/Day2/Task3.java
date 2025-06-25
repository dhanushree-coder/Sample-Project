package Day2;

import java.util.Scanner;

public class Task3 {

	
	
		

			public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);

			System.out.println("Enter the sentence: ");

			String a=sc.nextLine();

			String[] words=a.split(" ");

			System.out.println(" words in the sentence");

			for (String word:words)
			{

			System.out.println(word);
		    }
	}

		}
		
	
	
	
	

