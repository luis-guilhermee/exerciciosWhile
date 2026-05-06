package repeticaoWhile;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 0, soma = 0, numero;
		
		while (i < 10) {
			System.out.println("Escreva um número: ");
			numero = ler.nextInt();
			soma += numero;
			i++;
		} System.out.println("A soma de todos os números escritos é: " + soma);
		ler.close();
	}

}
