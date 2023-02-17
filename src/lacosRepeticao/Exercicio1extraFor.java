package lacosRepeticao;

import java.util.Scanner;

public class Exercicio1extraFor {

	public static void main(String[] args) {

		int numeros;

		Scanner sc = new Scanner(System.in);

		for (numeros = 1000; numeros <= 1999; numeros++) {

			if (numeros % 11 == 5) {
				System.out.println("Os números que quando dividos por 11 tem o resto 5 é:" + numeros);
			}
		}

	}

}
