package lacosCondicionais;

import java.util.Scanner;

public class Exercicio3ifElse {

	public static void main(String[] args) {

		String nome;
		int idade, doador;

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual seu nome?");
		nome = sc.next();

		System.out.println("Qual a sua idade?");
		idade = sc.nextInt();

		System.out.println("É a sua primeira doação de sangue? \n1 - sim \n2 - não");
		doador = sc.nextInt();

		if (idade >= 18 && idade <= 59) {
			System.out.println("Você está apto a doar sangue!");
		} else if (idade >= 60 && idade <= 69 && doador == 1) {
			System.out.println("Você está apto a daor sangue!");
		} else {
			System.out.println("Você não está apto a doar sangue!");
		}

	}

}
