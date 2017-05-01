package Array;

public class Passing_Fruits {
	
	public static void passingfruits(String[] array){
		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) {
		
		String fruits[] = {"Orange","Banana","Grapes","Mango","Pears"};
		passingfruits(fruits);
		System.out.println(fruits.length);
		
	}

}
