package Loops;

import java.util.Scanner;

public class Whileloop {
	
	public static void main(String[] args) {
		
		int correctcode = 1234;
	Scanner k = new Scanner(System.in);
	System.out.println("Enter the pin" );
	int entercode = k.nextInt();
	
	while (entercode != correctcode){
		  
		System.out.println("Please enter correct pin" );
		//k.nextInt();
		entercode = k.nextInt();		
	}
	System.out.println("Thankyou");
	}
	
	}
	
		 
	
		
	 
		
	
		
		
		
	
	


