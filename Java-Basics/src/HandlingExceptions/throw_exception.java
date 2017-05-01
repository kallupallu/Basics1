package HandlingExceptions;

public class throw_exception {

	
	public static void throwexcep() throws ArithmeticException {
	try{
		int i = 15/0;
		System.out.println(i);
	}
	catch (ArithmeticException e){
		System.out.println("Divide by 0 is error");
	}
	
}
	public static void main(String[] args) {
		throwexcep();
	}
}