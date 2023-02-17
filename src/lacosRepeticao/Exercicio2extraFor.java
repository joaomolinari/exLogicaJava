package lacosRepeticao;

import java.util.Scanner;

public class Exercicio2extraFor {

	public static void main(String[] args) {

		int numeros, numerosPares = 0, impares, x;

		Scanner sc = new Scanner(System.in);

		for (x = 1; x <= 10; x++) {

			System.out.println("Digite um número:");
			numeros = sc.nextInt();

			if (numeros % 2 == 0) {
				numerosPares++;
			}
		}
		impares = 10 - numerosPares;

		System.out.println("Os total de números pares são:" + numerosPares);
		System.out.println("Os total de números impares são:" + impares);

	}

}
