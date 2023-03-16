package Controle;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		
		Scanner cc = new Scanner(System.in);

		System.out.println("Partial average 1: \n");
		double average1 = cc.nextDouble();
		
		System.out.println("Partial Average 2 : \n");
		double average2 = cc.nextDouble();
		
		double average = (average1 + average2) / 2;
		
		if (average >= 7) {
			System.out.println("Your average is: "+ average +
					" you are approved /n");
		} else if (average >= 4) {
			System.out.println("Your average is: " + average +
					" You are in recovery/n");
		} else {
				System.out.println("your are is: " + average +
					"you are in flunk!!!");
  }
	cc.close();	
 }
}
