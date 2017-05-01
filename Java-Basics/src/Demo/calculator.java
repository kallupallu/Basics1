package Demo;

public class calculator {
	public void add (int a, int b){
		System.out.println(a+b);
	}
	public void substraction(int a, int b){
		System.out.println(a-b);
	}
	public void multiplication (int a, int b){
		System.out.println(a*b);
	}
	public void divide (int a, int b){
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		
		calculator basiccal = new calculator();
		basiccal.add(10,20);
		basiccal.substraction(40, 10);
		basiccal.multiplication(40, 10);
		basiccal.divide(40, 10);
		
	}

}
