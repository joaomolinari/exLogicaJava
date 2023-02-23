package vetores_Matrizes;

import java.util.Scanner;

public class Exercicio3matriz {

	public static void main(String[] args) {

		int numerosMatriz[][] = new int[3][3];
		int linha, coluna, somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;
		String valoresDiagonalPrincipal = "", valoresDiagonalSecundaria = "";

		Scanner sc = new Scanner(System.in);

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Digite um numero na posição [" + linha + "][" + coluna + "]:");
				numerosMatriz[linha][coluna] = sc.nextInt();

				if (linha == coluna) {
					valoresDiagonalPrincipal += numerosMatriz[linha][coluna] + " ";
					somaDiagonalPrincipal += numerosMatriz[linha][coluna];
				}
				if (linha + coluna == 2) {
					valoresDiagonalSecundaria += numerosMatriz[linha][coluna] + " ";
					somaDiagonalSecundaria += numerosMatriz[linha][coluna];
				}
			}
		}

		System.out.println("Elementos da diagonal principal:" + " " + valoresDiagonalPrincipal);
		System.out.println("Elementos da diagonal secundária:" + " " + valoresDiagonalSecundaria);
		System.out.println("Soma dos elementos da diagonal principal:" + " " + somaDiagonalPrincipal);
		System.out.println("Soma dos elementos da diagonal secundária:" + " " + somaDiagonalSecundaria);

	}

}