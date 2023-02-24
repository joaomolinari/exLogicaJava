package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3collectionSet {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();

		Scanner sc = new Scanner(System.in);

		for (int x = 1; x <=10; x++) {

			System.out.println("Digite o" + " " + x + "º número:");
			int dados = sc.nextInt();
			numeros.add(dados);
		}

		System.out.println("Listar dados do Set:");

		Iterator<Integer> iNumeros = numeros.iterator();

		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

	}

}
