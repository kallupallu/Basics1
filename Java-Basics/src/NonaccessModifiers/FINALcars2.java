package NonaccessModifiers;

public class FINALcars2 {
	public static void main(String[] args) {
		
		FINALcars toyota = new FINALcars();
		//toyota.color = "Red";  we cannot assign as color variable is declared final in FINALcars
		toyota.ihighestspeed = 20;
		toyota.imodel  = "Sports";
		FINALcars.steering = 2;
		FINALcars.doors = 4;
		FINALcars.wheels = 4;   	
		toyota.cardata();
		
	}

}
