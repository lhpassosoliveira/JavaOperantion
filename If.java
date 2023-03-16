package Controle;

import java.util.Scanner;


public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe sua média: ");
		double media = entrada.nextDouble();
		
		boolean criterioReprovadoAtingido =
				media < 4.5 && media >= 0;
				
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado! sua média : " + media);
			System.out.println("\nParabéns!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recuperação! sua média : " + media);
		}
		
		if(criterioReprovadoAtingido) {
			System.out.println("Reprovado! sua média : " + media);
		}
			
		entrada.close();
		
	}
}
