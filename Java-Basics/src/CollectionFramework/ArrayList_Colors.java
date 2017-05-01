package CollectionFramework;

import java.util.ArrayList;

public class ArrayList_Colors {
	public static void main(String[] args) {
		
		ArrayList<String>  colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Orange");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Black");
		colors.add("White");
		
		for (String AC: colors){
			System.out.println(AC);
		}
		System.out.println(colors.size());
		passingarraylist(colors);
			
	}
public static void passingarraylist(ArrayList<String> array){
	
	for (int i= 0; i<array.size(); i++){
		System.out.println(array.get(i));
	}
	
}

}
