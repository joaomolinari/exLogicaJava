package lacosRepeticao;

import java.util.Scanner;

public class Exercicio1for {

	public static void main(String[] args) {

		float n1, n2;
		int x;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número de 1 a 100:");
		n1 = sc.nextFloat();
		System.out.println("Digite outro número de 1 a 100:");
		n2 = sc.nextFloat();

		for (x = 1; x <= 100; x++) {

			if (n1 > n2) {
				System.out.println("Intervalo inválido!");
			} else if (x % 3 == 0 && x % 5 == 0) {
				System.out.println(x + " " + "É múltiplo de 3 e 5");
			}
		}

	}

}
