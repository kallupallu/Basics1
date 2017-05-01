package HandlingExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		
		try{
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = k.nextInt();
		System.out.println("Enter the second number");
		int num2 = k.nextInt();
		System.out.println("Value when " + num1 + " divided by " + num2 + " is 30" + num1/num2);
		}
	
	catch (ArithmeticException ae){
		System.out.println("Please enter correct number");
	}
	catch (InputMismatchException ie)	{
		System.out.println("String is not allowed, please enter correct number");
	}
	
}}
