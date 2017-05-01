package methodoverloading;

public class calculator {      
	
	public void add(int a , int b){
		System.out.println(a+b);
	}
	public void add(int a, int b, int c){
		System.out.println(a+b+c);
	}
	public void add(boolean a, boolean b){
		System.out.println('a' + 'b');   		
	} 	
	//when datatype is changed it is not considered method overloading   
	//public int add(int a, int b){ 
	
	public static void main(String[] args) {
		
		calculator basiccal = new calculator();
		basiccal.add(10 , 20);
		basiccal.add(10,20,30);
		basiccal.add(false, true);
			}
}



