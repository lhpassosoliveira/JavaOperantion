package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		do {
			System.out.println("você precisa falar... ");
			
			 
			System.out.print("digite Close pra sair!\n");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("Close"));
		
		entrada.close();
		}
}
