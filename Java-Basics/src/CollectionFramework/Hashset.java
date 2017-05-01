package CollectionFramework;
import java.util.HashSet;

public class Hashset {
		public static void main(String[] args) {           
			
			HashSet <String>  day = new HashSet<> ();			
			day.add("Monday");
			day.add("Tuesday");
			day.add("Wednesday");
			day.add("Thursday");
			day.add("Friday");
			day.add("Saturday");
			day.add("Sunday");
			day.add("Sunday");  //Hashset does not count or consider the duplicates
			
			for (String t: day){     				
				System.out.println(t);
			}               
			int num = day.size();// this displays the total size of the array
			System.out.println(num);
		}
	}



