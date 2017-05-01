package NonaccessModifiers;

public  final class FINALcars {

	
	 final String color = "Black";
	int ihighestspeed;
	String imodel;
	static int steering;
	static int doors;
	static int wheels;
	
	public FINALcars(){  		
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
	
}
	
