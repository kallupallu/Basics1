package CollectionFramework;

import java.util.ArrayList;

public class ArrayList_Fruits {
	public static void main(String[] args) {  	
	
	ArrayList<String> fruits = new ArrayList<>();
	 
	fruits.add("Apple");
	fruits.add("Orange");
	fruits.add("Pears");
	fruits.add("Mango");
	fruits.add("Grapes");
	fruits.add("WaterMelon");
	fruits.add("Strawberry");
	fruits.add("Guava");
	
	for (String AF: fruits){
		System.out.println(AF);
	}
	System.out.println(fruits.size());
	
	for (int i = 0; i<fruits.size(); i++){
		System.out.println(fruits.get(i));
	}
	
	}

}
