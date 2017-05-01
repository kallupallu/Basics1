package Loops;

import java.util.Scanner;

public class months {
	public static void main(String[] args) {
		
		String[]  montharray = {"JAN", "FEB", "MAR", "APRIL","MAY", "JUNE", "JULY", "AUG", "SEP","OCT","NOV","DEC"};
		
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the monthcode");
		
	     int entercode = k.nextInt();
	     
	    for (int i=0; i< 12 ; i++){
	     
	    System.out.println(montharray[entercode]);
	    
	       entercode = k.nextInt();
	    }
	    }
	     }


