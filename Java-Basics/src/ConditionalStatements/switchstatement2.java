package ConditionalStatements;
import java.util.Scanner;
public class switchstatement2 {	
		public static void main(String[] args) {
			
		String[] days = {"Monday", "Tuesday","Wednesday", "Thursday", "Friday"};				
			Scanner k = new Scanner(System.in);		 
		 System.out.println("Enter the day ");		 
		 String day = k.next();	 
		
			for(String ele:days){
			switch(day){
			
			case "Monday":
				System.out.println("Wear white color dress");
			break;	
			//case"monday":
			//	System.out.println("Wear white color dress");
			//break;
			case"Tuesday":
				System.out.println("Wear red color dress");
			break;	
			case"tuesday":
				System.out.println("Wear red color dress");
			break;
			case"Wednesday":
				System.out.println("Wear yellow color dress");
				break;
			case"wednesday":
				System.out.println("Wear yellow color dress");
				break;
			case"Thursday":
				System.out.println("Wear blue color dress");
				break;
			case"thursday":
				System.out.println("Wear blue color dress");
				break;
			case"Friday":
				System.out.println("Wear  green color dress");
				break;
			case"friday":
				System.out.println("Wear  green color dress");
				break;
				
			}
				day = k.next();
				System.out.println("please enter correct value");
			}
			}
			
}
