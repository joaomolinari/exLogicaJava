package lacosRepeticao;

import java.util.Scanner;

public class Exercicio3while {

	public static void main(String[] args) {

		int idade = 0, menores = 0, maiores = 0;

		Scanner sc = new Scanner(System.in);

		while (idade != -50) {

			System.out.println("Digite a idade:" + "(Para sair digite -50) ");
			idade = sc.nextInt();

			if (idade <= 21) {
				menores++;
			} else if (idade >= 50) {
				maiores++;
			}
		}
		System.out.println("O total de pessoas com idade menor que 21 anos são:" + " " + menores + " " + "pessoas");
		System.out.println("O total de pessoas com idade maior que 50 anos são:" + " " + maiores + " " + "pessoas");
	}

}
