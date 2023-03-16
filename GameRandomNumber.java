package Controle;

import java.util.Random;
import java.util.Scanner;

public class GameRandomNumber {
/**
	Guessing Game: Try to guess a number between 0 - 100. Store
	  * a random number in a variable. Player has 10 attempts to
	  * Guess the generated number. At the end of each trial, print the amount
	  * of remaining attempts, and print whether the entered number is greater or less than
	  *than the stored number.
*/
	public static void main(String[] args) {
		
	 Scanner cc = new Scanner(System.in);
	  int continue1;
	  int randomNumber;
	  int attemps;
	  int number;

	  do {
	   System.out.println("raffle number between 10 to 100...\n");
	   Random randon = new Random();
	   randomNumber = randon.nextInt(101);

	   System.out.println("game started! can you win?");
	   attemps = 0;

	   do {
	    attemps++;
	    System.out.printf("Attemps %d: ", attemps);
	    number = cc.nextInt();

	    if (number > randomNumber) {

	     System.out.printf("\nthe number is less than %d\n\n", number);

	    } else if (number < randomNumber) {

	     System.out.printf("\nthe number is greater than %d\n\n", number);

	    } else {

	     System.out.printf("\ncongratulations, you managed to hit the number in %d attemps!\n\n", attemps);
	     break;
	    }

	   } while (attemps != 10);

	   System.out.println("type 0 to exit, or any other number to continue: ");
	   continue1 = cc.nextInt();

	  } while (continue1 != 0);

	  cc.close();
}

}
