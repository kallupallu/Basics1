package Demo;

import java.util.Scanner;

public class RolledDice {
	public static void main(String[] args) {
		
		int[] dice1 = {1,2,3,4,5,6};
		int[] dice2 = {1,2,3,4,5,6};
		
		for (int i=0; i<=1; i++){
		Scanner k = new Scanner(System.in);
		System.out.println("dice1");
		int Rolleddice1 = k.nextInt();
		System.out.println("dice2");
		int Rolleddice2 = k.nextInt();
		
		System.out.println("Dice  " + (Rolleddice1+Rolleddice2));
		}
	}

}
