package NonaccessModifiers;

public class STATICcars  {  
	String color;
	int ihighestspeed;
	String imodel;
	static int steering;
	static int doors;
	static int wheels;
	
	public STATICcars(){  		
		steering = 2;
		doors = 2;  		
	}	
	public  void cardata(){ 		
		System.out.println(color);
		System.out.println(ihighestspeed);
		System.out.println(imodel);
		System.out.println(steering);
		System.out.println(doors);
		System.out.println(wheels);
	}   	
	public static void cardata2() { 
		System.out.println(steering);
		System.out.println(doors);
		System.out.println(wheels);
		
	}
}
	

