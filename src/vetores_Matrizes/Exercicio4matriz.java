package vetores_Matrizes;

import java.util.Scanner;

public class Exercicio4matriz {

	public static void main(String[] args) {

		float notas[][] = new float[10][4];
		float media[] = new float[10];
		int linha, coluna;

		Scanner sc = new Scanner(System.in);

		for (linha = 0; linha < notas.length; linha++) {
			for (coluna = 0; coluna < notas[coluna].length; coluna++) {
				System.out.printf("Digite um numero na posição [" + linha + "][" + coluna + "]:");
				notas[linha][coluna] = sc.nextFloat();
			}
		}

		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 4; y++) {
				media[x] += notas[x][y];
			}

			media[x] = media[x] / 4;
		}

		for (int x = 0; x < 10; x++) {
			System.out.printf("A média do aluno %d é: %.1f \n", (x + 1), media[x]);
		}

	}

}
