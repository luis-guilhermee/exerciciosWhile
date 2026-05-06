package repeticaoWhile;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 0, idade, soma = 0;
		
		while (i < 20) {
			System.out.println("Qual sua idade? ");
			idade = ler.nextInt();
			if (idade >= 18) {
				soma ++;
			} i++;
		} System.out.println("O número de pessoas maior de idade é: " + soma);
		ler.close();

	}

}
