package Controle;

import java.util.Scanner;

public class AgendamentoScanner {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe seu nome: ");
		String agendamento = entrada.next();
		
		System.out.println("Informe o  horário de atendemento");
		double horario = entrada.nextDouble();
		
		System.out.println("Obrigado seu " + agendamento +",  agendamento ta concluido! seu horario é " + horario);
		entrada.close();
		
	}
}
