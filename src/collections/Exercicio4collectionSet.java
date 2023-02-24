package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4collectionSet {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número que deseja encontrar:");
		int numeroDesej = sc.nextInt();

		if (numeros.contains(numeroDesej)) {
			System.out.println("O número" + " " + numeroDesej + " " + "foi encontrado!");
		} else {
			System.out.println("O número" + " " + numeroDesej + " " + "não foi encontrado!");
		}

	}

}
