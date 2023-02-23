package vetores_Matrizes;

import java.util.Scanner;

public class Exercicio1vetor {

	public static void main(String[] args) {

		int vetorNumeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para saber a sua posição no vetor:");
		numero = sc.nextInt();

		for (int x = 0; x < vetorNumeros.length; x++) {

			if (vetorNumeros[x] == numero) {
				System.out.println("A posição do número" + " " + numero + " no vetor é:" + x);
			} else if (x == vetorNumeros.length - 1) {
				System.out.println("Número não localizado no vetor!");
			}
		}

	}

}
