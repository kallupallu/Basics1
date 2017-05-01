package Loops;

import java.util.Scanner;

public class ATMPIN {
	public static void main(String[] args) {		
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter you pin ");
		int correctpin = 12345;
		int pin = k.nextInt();
		while (correctpin != pin){			
			System.out.println("Please enter the correct pin");
			pin = k.nextInt();  			
		}
		System.out.println("Welcome to ABC bank");		
	}

}
