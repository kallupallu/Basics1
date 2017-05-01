package Inheritance;

import Demo.managmentInheritance;

public class securityInheritance extends managmentInheritance{
	 int bonus = 2500;
	 
	 public static void main(String[] args) {
			
			securityInheritance pam = new securityInheritance ();
	         
	        pam.day();
	         
	         System.out.println(" Total salary for pam is " + (pam.salary+pam.bonus));
}
}
