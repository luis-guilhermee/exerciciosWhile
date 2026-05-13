package repeticaoWhile;

import java.util.Scanner;

public class TesteArray {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, media, usuarios = 0;
		String resposta1 = "", resposta2 = "";
		String gabarito[] = { "a", "b", "c", "d", "e", "e", "d", "c", "b", "a" };
		String[] resposta = new String[11];
		do {
			System.out.println("Gostaria de saber sua nota? (sim ou nao)");
			resposta1 = ler.next();
			if (resposta1.equals("sim")) {
				usuarios++;
				nota1 = 0;
				int q = 1;
				for (int j = 0; j <= 9; j++) {
					System.out.println("Qual foi a alternativa marcada na questão " + q++ + "? (a, b, c, d, e)");
					resposta[j] = ler.next();
					if (gabarito[j].equals(resposta[j])) {
						nota1++;
						nota2++;
					}

				}
				System.out.println("Sua nota foi: " + nota1);
				media = nota2 / usuarios;
				System.out.println("A média das notas foi: " + media);
				System.out.println("O número de usuários foi: " + usuarios);
				System.out.println("Deseja repetir o processo? (sim ou nao)");
				resposta2 = ler.next();
			} else {
				System.out.println("Fim da correção");
				if (usuarios > 0) {
					media = nota2 / usuarios;
					System.out.println("O número de usuários foi: " + usuarios);
					System.out.println("A média das notas foi: " + media);
				}
			}
		} while (resposta2.equals("sim"));
		System.out.println("Obrigado!!");
		ler.close();

	}
}