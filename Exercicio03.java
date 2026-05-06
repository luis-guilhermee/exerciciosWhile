package repeticaoWhile;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 0;
		String nome;

		System.out.println("Qual seu nome? ");
		nome = ler.next();

		while (i < 10) {
			System.out.println(nome);
			i++;
		}
		ler.close();

	}

}
