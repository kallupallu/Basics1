package Array;
public class CarsArray {	
	public static void main(String[] args) {
		
		String [] carmake = {"BMW","AUDI", "HONDA","MERCEDES","NISSAN"};  		 
		int arraylength = carmake.length;  		
		System.out.println("Length of the array is " + arraylength);
		System.out.println(carmake[2]);
		System.out.println(carmake[arraylength-1]);   		
	  for  (String ers:carmake) {  		  
		  System.out.println(ers);
			
		}
	}
}
