package Controle;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua nota: ");
		
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Parabens! voce passou com a nota maxima.");
		}else if(nota >= 8.1) {
			System.out.println("Aprovado! Parabens!!");
		}else if(nota >= 6.1) {
			System.out.println("Recuperação! Estude mais para passar.");
		}else if(nota >= 4.1) {
			System.out.println("Reprovado! Não foi dessa vez.");		
		}else if(nota >= 2.1) {
			System.out.println("Nota muito baixa!");
		}else {
			System.out.println("Nota invalida!!");
		}
		entrada.close();
	}
}
