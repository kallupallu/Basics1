package Array;

import java.util.HashSet;

public class HashSet_Colors {
	public static void main(String[] args) {
		
		HashSet<String> colors = new HashSet<>();
		
		colors.add("Red");
		colors.add("Orange");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Black");
		colors.add("White");
		colors.add("White");
		
		for (String HC: colors){
			System.out.println(HC);
		}
		
	}

}
