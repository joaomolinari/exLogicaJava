package estruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2StackPilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		int decisao;
		String nomeLivro = null;

		Scanner leia = new Scanner(System.in);

		System.out.println("*********************************");
		System.out.println("1 - Adicionar livro na pilha");
		System.out.println("2 - Listar livros");
		System.out.println("3 - Retirar livro da pilha");
		System.out.println("0 - Sair");
		System.out.println("*********************************");
		System.out.println("Entre com a opção desejada:");
		decisao = leia.nextInt();

		while (decisao < 0 || decisao > 3) {

			System.out.println("OPÇÃO INVÁLIDA");
			System.out.println("*********************************");
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("*********************************");
			System.out.println("Entre com a opção desejada:");
			decisao = leia.nextInt();

		}

		while (decisao > 0 && decisao <= 3) {

			switch (decisao) {

			case 1:
				leia.nextInt();
				System.out.println("Digite o nome do livro:");
				nomeLivro = leia.next();
				pilha.push(nomeLivro);
				System.out.println("O livro:" + " " + nomeLivro + " " + "foi adicionado");

				break;

			case 2:
				leia.nextInt();
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia");
				} else {
					System.out.println(pilha);
				}

				break;

			case 3:
				leia.nextInt();
				pilha.pop();
				System.out.println(pilha);
				System.out.println("Um livro foi retirado!");

				break;

			}

			System.out.println("*********************************");
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("*********************************");
			System.out.println("Entre com a opção desejada:");
			decisao = leia.nextInt();

			while (decisao < 0 || decisao > 3) {

				System.out.println("OPÇÃO INVÁLIDA");
				System.out.println("*********************************");
				System.out.println("1 - Adicionar livro na pilha");
				System.out.println("2 - Listar livros");
				System.out.println("3 - Retirar livro da pilha");
				System.out.println("0 - Sair");
				System.out.println("*********************************");
				System.out.println("Entre com a opção desejada:");
				decisao = leia.nextInt();

			}

			switch (decisao) {

			case 0:

				System.out.println("Obrigado! Volte sempre!");

				break;
			}

		}

	}

}
