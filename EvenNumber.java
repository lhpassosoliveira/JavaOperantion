package Controle;

import java.util.Scanner;

public class EvenNumber {
 
	public static void main(String[] args) {
	

	Scanner cc = new Scanner(System.in);

	System.out.println("type the number: ");
	
	int number = cc.nextInt();

	if (number >= 0 && number <= 999999) {
		if (number % 2 == 0) {
			System.out.println("The number: " + number + " is an even number");
		} else {                 
			System.out.println("The number: " + number + " is an imperious number.");
		}                         

	cc.close();
  }
 }
}