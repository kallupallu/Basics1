package ConditionalStatements;

import java.util.Scanner;

public class ColorSwitch {
	public static void main(String[] args) {  	
	
	String[] colorarray = {"red", "yellow", "black", "green","orange"};
	
	Scanner k = new Scanner(System.in);
	System.out.println("Enter the color ");
	String color = k.next();
	
	switch(color){
	
	case "red" :
		System.out.println("This is red color");
		break; 		
	case "yellow" :
		System.out.println("This is yellow color");
		break;
	case "black" :
		System.out.println("This is black color");
		break;
	case "green" :
		System.out.println("This is green color");
		break;
	case "orange" :
		System.out.println("This is orange color");
		break;
	
	}   	
}
}
