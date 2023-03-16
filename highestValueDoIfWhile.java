package Controle;

import java.util.Scanner;

public class highestValueDoIfWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int HighestValue = 0;
		int counter = 0;

		do {
			System.out.println("\nType a number: ");
			int value = scanner.nextInt();

			if (value > HighestValue) {
				HighestValue = value;
			}
			counter++;
			
		} while (counter != 3);
		
		System.out.printf("The highest the value is: " + HighestValue);
		scanner.close();
	}
	}

