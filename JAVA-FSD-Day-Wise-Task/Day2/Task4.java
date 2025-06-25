package Day2;
import java.util.*;
public class Task4 {
	
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter text: ");
	        String s = sc.nextLine();
	        
	        System.out.println("Chars (incl spaces): " + s.length());
	        String[] w = s.trim().isEmpty() ? new String[0] : s.trim().split("\\s+");
	        System.out.println("Words: " + w.length);
	        
	        String longest = "";
	        for (String x : w) if (x.length() > longest.length()) longest = x;
	        System.out.println("Longest word: " + longest);
	        
	        String rev = new StringBuilder(s).reverse().toString();
	        System.out.println("Reversed: " + rev);
	        
	        sc.close();
	    }
	}

	
	
	
	
	
	
	
	
	
	
	


