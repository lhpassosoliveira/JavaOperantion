package Controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while (!valor.equalsIgnoreCase("close")) {
			System.out.print("Você: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();
	}
}
