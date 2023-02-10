package lacosCondicionais;

import java.util.Scanner;

public class Exercicio5SwitchCase {

	public static void main(String[] args) {

		int cod, quant;
		float valor;

		Scanner sc = new Scanner(System.in);

		System.out.println("Lanchonete JV");
		System.out.println("Codigo 1 - Cachorro Quente - R$10,00");
		System.out.println("Codigo 2 - X-Salada - R$15,00");
		System.out.println("Codigo 3 - X-Bacon - R$18,00");
		System.out.println("Codigo 4 - Bauru - R$12,00");
		System.out.println("Codigo 5 - Refrigerante - R$8,00");
		System.out.println("Codigo 6 - Suco de Laranja - R$13,00");
		System.out.println("Digite o código do produto: ");
		cod = sc.nextInt();
		System.out.println("Digite a quantidade de produtos: ");
		quant = sc.nextInt();

		switch (cod) {
		case 1:
			valor = quant * 10;
			System.out.println("Produto: Cachorro Quente - Valor a pagar: " + valor);
			break;
		case 2:
			valor = quant * 15;
			System.out.println("Produto: X-Salada - Valor a pagar: " + valor);
			break;
		case 3:
			valor = quant * 18;
			System.out.println("Produto: X-Bacon - Valor a pagar: " + valor);
			break;
		case 4:
			valor = quant * 12;
			System.out.println("Produto: Bauru - Valor a pagar: " + valor);
			break;
		case 5:
			valor = quant * 8;
			System.out.println("Produto: Refrigerante - Valor a pagar: " + valor);
			break;
		case 6:
			valor = quant * 13;
			System.out.println("Produto: Suco de laranja - Valor a pagar: " + valor);
			break;
		default:
			System.out.println("Opção Inválida");
		}

	}

}
