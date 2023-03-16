package Controle;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int divisorcounter = 0;
		Scanner cc = new Scanner(System.in);
		
		System.out.println("type to see if the number is prime:");
		int number = cc.nextInt();
		
		for (int i = 2; i< number; i++) {
			if (number % i == 0) {
				divisorcounter++;
				
			}
		}
		
		switch (divisorcounter) {
		
		case 0:
		System.out.println("The number: " + number + " is a prime number.\n");
		break;
		default:
			System.out.println("\nThe number: " + number + " is a not prime number.");
			
			
		}

		
		
		cc.close();
		
	}
}
