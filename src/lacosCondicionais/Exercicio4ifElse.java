package lacosCondicionais;

import java.util.Scanner;

public class Exercicio4ifElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String palavra1, palavra2, palavra3;

		System.out.println("Digite a primeira palavra: ");
		palavra1 = sc.next();
		System.out.println("Digite a segunda palavra: ");
		palavra2 = sc.next();
		System.out.println("Digite a terceira palavra: ");
		palavra3 = sc.next();

		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("ave")) {
				if (palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("É uma aguia");
				} else {
					System.out.println("É uma pomba");
				}
			} else {
				if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("É um ser humano");
				} else {
					System.out.println("É uma vaca");
				}
			}
		} else {
			if (palavra2.equalsIgnoreCase("inseto")) {
				if (palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nÉ uma pulga");
				} else {
					System.out.println("\nÉ uma lagarta");
				}
			} else {
				if (palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("É uma sanguessuga");
				} else {
					System.out.println("É uma minhoca");
				}
			}
		}

	}

}