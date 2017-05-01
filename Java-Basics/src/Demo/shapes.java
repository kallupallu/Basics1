package Demo;

public class shapes {
	
	int length;
	int width;
	
	public shapes(){
		
		length=10;
		width=20;  	
	}
	
	public shapes(int a, int b){
		
		length = a;
		width = b;   
	}
	
	public void area (){
		System.out.println("area of rectangle " + length*width + "sq.cm");
	}
	
	public static void main(String[] args) {
		
		shapes rectangle1 = new shapes();
		rectangle1.area();
		
		shapes rectangle2 = new shapes(30,40);
		rectangle2.area();
		
	}
}
