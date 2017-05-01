package NonaccessModifiers;

public class STATICcars2 { 	
	public static void main (String[] args) { 		
		STATICcars toyota = new STATICcars();
		
		toyota.color = "Red";
		toyota.ihighestspeed = 20;
		toyota.imodel  = "Sports";
		STATICcars.steering = 2;
		STATICcars.doors = 4;
		STATICcars.wheels = 4;   	
		toyota.cardata();
		STATICcars.cardata2();
		
	} 

}

