package Constructors; 
import java.util.Scanner; 
public class Traintickets {   	
	int price;
	double price2;
	double price3;    
	
	public Traintickets(int ticketprice){  		
		price = ticketprice;
		price2 = (ticketprice - (ticketprice*.15));
		price3 = (ticketprice - (ticketprice*.50));    		
	}    	
	public static void main(String[] args) {         		
		Traintickets tickets = new Traintickets(100);   		
		System.out.println("Ticket price for the adult is Rs" + tickets.price);
		System.out.println("Ticket price for the SeniorCitizen is Rs" + tickets.price2);
		System.out.println("Ticket price for the child is Rs" + tickets.price3);
		
		}
		
	}
	
	
	
	


