package Demo;

public class HRInheritance extends managmentInheritance {	
	 int bonus = 2000;	
		
		public static void main(String[] args) {		
			
	         HRInheritance sam = new HRInheritance();
	         
	        sam.day();	 
	         System.out.println(" Total salary for sam  is " + (sam.salary + sam.bonus));
			

}
}
