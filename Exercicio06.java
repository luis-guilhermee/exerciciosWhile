package repeticaoWhile;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 0, numero;
		String nome;

		System.out.println("Escreva seu nome: ");
		nome = ler.next();

		System.out.println("Quantas vezes você quer que ele apareça no console? ");
		numero = ler.nextInt();

		while (i < numero) {
			System.out.println(nome);
			i++;
		}
		ler.close();

	}

}
