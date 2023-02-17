package lacosRepeticao;

import java.util.Scanner;

public class Exercicio2for {

	public static void main(String[] args) {

		int x, numeros, pares = 0, impares;

		Scanner sc = new Scanner(System.in);

		for (x = 1; x <= 10; x++) {

			System.out.println("Digite o" + " " + x + "º número");
			numeros = sc.nextInt();

			if (numeros % 2 == 0) {
				pares++;
			}

		}
		impares = 10 - pares;

		System.out.println("O total de números pares são:" + pares);
		System.out.println("O total de números impares são:" + impares);

	}

}
