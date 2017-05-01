package ConditionalStatements;

import java.util.Scanner;

public class switchstatement1 {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the day");
		String day = k.next().toLowerCase();
		
		switch(day){
		case "monday":
			System.out.println("Wear the red color");
			break;
		case"tuesday":
			System.out.println("wear the blue color");
			break;
		case "wednesday":
			System.out.println("wear the yellow color");
			break;
		case "thursday":
			System.out.println("wear the yellow color");
			break;
		case "friday":
			System.out.println("wear the yellow color");
			break;
		case "saturday":
			System.out.println("wear the yellow color");
			break;
		case "sunday":
			System.out.println("wear the yellow color");
			break;
				
		}
		
		
	}
}
