package Controle;

import java.util.Scanner;

public class DiaDaSemana {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite nome do dia: ");
		String dia = entrada.next();
	
		if("Domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);	
		} else if("Segunda-feira".equalsIgnoreCase(dia)) {
			System.out.println(2);
		}else if("terça-feira".equalsIgnoreCase(dia)
				|| "Terca-feira".equalsIgnoreCase(dia)) {
			System.out.println(3);		
		} else if("Quarta-feira".equalsIgnoreCase(dia)) {
			 System.out.println(4);
		} else if("Quinta-feira".equalsIgnoreCase(dia)) {
			 System.out.println(5);
		} else if("Sexys-feira".equalsIgnoreCase(dia)) {
			 System.out.println(6);
		} else if("Sábado".equalsIgnoreCase(dia)
			|| "sabado".equalsIgnoreCase(dia)) {
		}  else {
				System.out.println("Dia invalido");
		}
		entrada.close();
	}		
}
