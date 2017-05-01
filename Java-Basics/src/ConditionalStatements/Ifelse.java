package ConditionalStatements;
import java.util.Scanner;
public class Ifelse { 	
	public static void main(String[] args) { 			
		Scanner k = new Scanner(System.in);
		//String [] students  = {"Student 1", "Student 2", "Student 3", "Student 4", "Student 5"};
		int [] students = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};	
		
		//for (int i=0; i<=15; i++)	{
		for (int stu: students){// obj:arrayname  will display all the elements  in the  array
			
		System.out.println("Marks for student  "  + stu);		
				
		int marks = k.nextInt();			
		if (marks>80){  			
			System.out.println("You got Grade A");			
		} 		
		else if(marks>60){ 			
			System.out.println("You got Grade B");			
		}  		
		else if (marks >40){ 			
			System.out.println("You got Grade c"); 			
		} 		
		else if (marks<40){ 			
			System.out.println("You are failed");  			
		}  			
		//marks = k.nextInt(); 		
				}
		}
	}



