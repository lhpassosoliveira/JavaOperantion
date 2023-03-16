package Controle;

import java.util.Scanner;

public class forWord {

	public static void main(String[] args) {
		
	
		Scanner cc = new Scanner(System.in);

		System.out.println("Type a word: ");
		String word = cc.nextLine();

		char letters[] = word.toCharArray();

		for (int i = 0; i < word.length(); i++) {
			System.out.println(letters[i]);
		}

		cc.close();
}
}