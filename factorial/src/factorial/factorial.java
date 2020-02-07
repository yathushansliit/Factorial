package factorial;

import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;

public class factorial {
	
	 public static  int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }   

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number = scanner.nextInt();
	
		
		
		int fact = factorial(number);   
		System.out.println("The factorial of :-" +number+ " is " +fact );

	}

}
