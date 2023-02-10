package lacosCondicionais;

import java.util.Scanner;

public class Exercicio2ifElse {

	public static void main(String[] args) {

		int valorA;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		valorA = sc.nextInt();

		if (valorA % 2 == 0) {

			if (valorA > 0) {
				System.out.println("O número é par e positivo!");
			} else {
				System.out.println("O número é par e negativo!");
			}

		} else {
			if (valorA > 0) {
				System.out.println("O número é ímpar e positivo!");
			} else {
				System.out.println("O número é impar e negativo!");
			}
		}

	}
}
