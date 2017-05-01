package Demo;
public class Swap {	
	int num1;
	int num2;
	int num3;
	
	public Swap(){		
	 num1 = 30;
	 num2 = 20;
	 }
	public void swap(){
		num3 = num2;
		System.out.println("num1 = " + num3);
		
		num2 = num1;
		System.out.println("num2 = " + num2);
		
			}
public static void main(String[] args){
	
	Swap swapping = new Swap();
	
	swapping.swap();
	}
	
}
		
	
		
		
	


