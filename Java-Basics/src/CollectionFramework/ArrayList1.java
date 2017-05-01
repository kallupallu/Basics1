package CollectionFramework;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		
		ArrayList <String>  day = new ArrayList<> ();       //arraylist can have as many values in it, size is not limited
		
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
