package ConditionalStatements;

import java.util.Scanner;

public class switchstatement {	
	public static void main(String[] args) {		
		
	 Scanner k = new Scanner(System.in);	 	 
	 for (int i = 0; i<=5; i++){
	         System.out.println("Enter the day ");
	       String day = k.next();   
		
		switch(day){
		
		case "Monday":
			System.out.println("Wear white color dress");
		break;		
		case"Tuesday":
			System.out.println("Wear red color dress");
			break;			
		case"Wednesday":
			System.out.println("Wear yellow color dress");
			break;
		case"Thursday":
			System.out.println("Wear blue color dress");
			break;
		case"Friday":
			System.out.println("Wear  green color dress");
			break;		
		}
			
		//day = k.next();
				}
				
		}		
			
	}
	


