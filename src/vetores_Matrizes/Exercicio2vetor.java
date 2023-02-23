package vetores_Matrizes;

import java.util.Scanner;

public class Exercicio2vetor {

	public static void main(String[] args) {
		
		int vetorNumeros[] = new int [10];
		int x, soma = 0;
		String impares = "", pares = "";
		
		
		Scanner sc = new Scanner(System.in);

		for (x = 0; x < vetorNumeros.length; x++) {
			System.out.println("Digite o número da posição:" + " " + x);
			vetorNumeros[x] = sc.nextInt();

			soma += vetorNumeros[x];
		}

		for (x = 0; x < vetorNumeros.length; x++) {

			if (x % 2 != 0) {
				impares += vetorNumeros[x] + " ";
			}

			if (vetorNumeros[x] % 2 == 0) {
				pares += vetorNumeros[x] + " ";
			}
		}

		System.out.println("Números nos índices ímpares:" + " " + impares);
		System.out.println("Elementos pares:" + " " + pares);
		System.out.println("Soma:" + " " + soma);
	}
}
