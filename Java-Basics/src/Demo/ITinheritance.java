package Demo;

public class ITinheritance extends managmentInheritance {
        
	int bonus = 5000;
	
	public static void main(String[] args) {
         ITinheritance ram = new ITinheritance();
         
        ram.day();
              
         System.out.println(" Total salary for ram is " + ( ram.salary + ram.bonus));
		
		
	}
	
}
