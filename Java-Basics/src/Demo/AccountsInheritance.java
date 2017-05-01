package Demo; 
public class AccountsInheritance  extends managmentInheritance{  	
	 int bonus = 4000;    		
		public static void main(String[] args) {  		
			
			AccountsInheritance lam = new AccountsInheritance();
	         
	        lam.day();               
	       
	         System.out.println(" Total salary for lam is " + (lam.salary+lam.bonus));
			}
}
