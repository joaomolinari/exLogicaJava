package lacosRepeticao;

import java.util.Scanner;

public class Exercicio5doWhile {

	public static void main(String[] args) {

		int numeros2, soma = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Digite outro número:");
			numeros2 = sc.nextInt();

			if (numeros2 > 0) {
				soma += numeros2;
			}

		} while (numeros2 != 0);

		System.out.println("A soma dos números positivos é:" + soma);

	}

}
