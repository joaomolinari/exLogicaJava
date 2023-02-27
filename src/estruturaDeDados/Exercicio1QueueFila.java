package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1QueueFila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		int decisao;
		String nomeCliente = null;

		Scanner leia = new Scanner(System.in);

		System.out.println("*********************************");
		System.out.println("1 - Adicionar cliente na fila");
		System.out.println("2 - Listar todos os clientes");
		System.out.println("3 - Retirar cliente da lista");
		System.out.println("0 - Sair");
		System.out.println("*********************************");
		System.out.println("Entre com a opção desejada:");
		decisao = leia.nextInt();

		while (decisao < 0 || decisao > 3) {

			System.out.println("OPÇÃO INVÁLIDA");
			System.out.println("*********************************");
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da lista");
			System.out.println("0 - Sair");
			System.out.println("*********************************");
			System.out.println("Entre com a opção desejada:");
			decisao = leia.nextInt();

		}

		while (decisao > 0 && decisao <= 3) {

			switch (decisao) {

			case 1:
				leia.nextInt();
				System.out.println("Digite o nome do cliente:");
				nomeCliente = leia.next();
				fila.add(nomeCliente);
				System.out.println("O cliente" + " " + nomeCliente + " " + "foi adicionado!");

				break;

			case 2:
				leia.nextInt();
				System.out.println("Lista de clientes na fila:");
				System.out.println(fila);
				break;

			case 3:
				leia.nextInt();
				if (fila.isEmpty()) {
					System.out.println("Não há clientes na fila!");
				} else {
					System.out.println("O cliente" + " " + fila.poll() + " " + "foi chamado!");
				}

				break;
			}

			System.out.println("*********************************");
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da lista");
			System.out.println("0 - Sair");
			System.out.println("*********************************");
			System.out.println("Entre com a opção desejada:");
			decisao = leia.nextInt();

			while (decisao < 0 || decisao > 3) {

				System.out.println("OPÇÃO INVÁLIDA");
				System.out.println("*********************************");
				System.out.println("1 - Adicionar cliente na fila");
				System.out.println("2 - Listar todos os clientes");
				System.out.println("3 - Retirar cliente da lista");
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
