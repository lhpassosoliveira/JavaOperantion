package Controle;

import java.util.Scanner;

public class IfElseyearLeap {

	public static void main(String[] args) {
		
		Scanner cc = new Scanner(System.in);
		
		
		System.out.println("enter the year: ");
		int year = cc.nextInt();
		
		boolean yearLeap = year % 4 == 0 && ((year %
						100) !=0 || year % 400 == 0);
		
		if (yearLeap == true) {
			System.out.println(year + "\n"
					+  " it's a leap year");
		}else { 
			System.out.println(year + "\n it's not"
					+ " a leap year");
			
		}
		cc.close();
	}
	
}
