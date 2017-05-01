package Loops;

import java.util.Scanner;

public class WrongPin {
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter your ATM Pin");
		int Correctpin = 12345;
		 int pin = k.nextInt();	 		
		 for (int i=0; i<=1 ; i++){ 			 
			  if(  Correctpin != pin){
				 System.out.println("Please enter correct pin");  				 
			 }				       	       
		       if(Correctpin == pin){
		    	   System.out.println("Welcome to ABC bank");
		    	   break;
		       }
		       pin = k.nextInt();	  		   		   
		 }
		
		 if (Correctpin != pin){
			 System.out.println("Your account has been blocked");
		 }      			 
		
	}
		 
}

		 


