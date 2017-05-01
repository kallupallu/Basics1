package CollectionFramework;
import java.util.LinkedList;

public class Linkedlist {
	
		public static void main(String[] args) {
			
			LinkedList <String>  day = new LinkedList<> ();			
			day.add("Monday");
			day.add("Tuesday");
			day.add("Wednesday");
			day.add("Thursday");
			day.add("Friday");
			day.add("Saturday");
			day.add("Sunday");
			
			for (String t: day){				
				System.out.println(t);
			}
			
			int num = day.size();// this displays the total size of the array
			System.out.println(num);
		}
	}


