package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1ArrayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		for (int x = 1; x <= 5; x++) {

			System.out.println("Digite a" + x + "ª cor");
			String cor = sc.nextLine();
			cores.add(cor);
		}

		System.out.println("As cores escolhidas foram:");

		for (int x = 0; x < cores.size(); x++) {
			System.out.println(cores.get(x));
		}

		System.out.println();

		cores.sort(null);

		System.out.println("As cores em ordem alfabética são:");

		for (int x = 0; x < cores.size(); x++) {
			System.out.println(cores.get(x));
		}

	}

}
