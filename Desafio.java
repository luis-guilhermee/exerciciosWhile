package repeticaoWhile;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nota1 = 0, nota2 = 0, media, usuarios = 0;
		String resposta1 = "", resposta2 = "", q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, c1 = "a", c2 = "b", c3 = "c",
				c4 = "d", c5 = "e", c6 = "e", c7 = "d", c8 = "c", c9 = "b", c10 = "a";

		do {
			System.out.println("Gostaria de saber sua nota? (sim ou nao)");
			resposta1 = ler.next();
			if (resposta1.equals("sim")) {
				usuarios++;
				nota1 = 0;

				System.out.println("Qual foi a alternativa marcada na questão 1? (a, b, c, d, e");
				q1 = ler.next();
				if (q1.equals(c1)) {
					nota1++;
					nota2++;
				}
				System.out.println("Qual foi a alternativa marcada na questão 2? (a, b, c, d, e");
				q2 = ler.next();
				if (q2.equals(c2)) {
					nota1++;
					nota2++;
				}
				System.out.println("Qual foi a alternativa marcada na questão 3? (a, b, c, d, e");
				q3 = ler.next();
				if (q3.equals(c3)) {
					nota1++;
					nota2++;
				}
				System.out.println("Qual foi a alternativa marcada na questão 4? (a, b, c, d, e");
				q4 = ler.next();
				if (q4.equals(c4)) {
					nota1++;
					nota2++;
				}
				System.out.println("Qual foi a alternativa marcada na questão 5? (a, b, c, d, e");
				q5 = ler.next();
				if (q5.equals(c5)) {
					nota1++;
					nota2++;
				}
				System.out.println("Qual foi a alternativa marcada na questão 6? (a, b, c, d, e");
				q6 = ler.next();
				if (q6.equals(c6)) {
					nota1++;
					nota2++;
				}
				System.out.println("Qual foi a alternativa marcada na questão 7? (a, b, c, d, e");
				q7 = ler.next();
				if (q7.equals(c7)) {
					nota1++;
					nota2++;
				}
				System.out.println("Qual foi a alternativa marcada na questão 8? (a, b, c, d, e");
				q8 = ler.next();
				if (q8.equals(c8)) {
					nota1++;
					nota2++;
				}
				System.out.println("Qual foi a alternativa marcada na questão 9? (a, b, c, d, e");
				q9 = ler.next();
				if (q9.equals(c9)) {
					nota1++;
					nota2++;
				}
				System.out.println("Qual foi a alternativa marcada na questão 10? (a, b, c, d, e");
				q10 = ler.next();
				if (q10.equals(c10)) {
					nota1++;
					nota2++;
				}
				System.out.println("Sua nota foi: " + nota1);
				media = nota2 / usuarios;
				System.out.println("A média das notas foi: " + media);
				System.out.println("Deseja repetir o processo? (sim ou nao)");
				resposta2 = ler.next();
			} else {
				System.out.println("Fim da correção");
				if (usuarios > 0) {
					media = nota2 / usuarios;
					System.out.println("A média das notas foi: " + media);
				}
			}
		} while (resposta2.equals("sim"));
		System.out.println("Obrigado!!");
		ler.close();

	}

}
