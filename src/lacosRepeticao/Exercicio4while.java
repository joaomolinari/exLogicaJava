package lacosRepeticao;

import java.util.Scanner;

public class Exercicio4while {

	public static void main(String[] args) {

		int afirmacao=1, idade, sexo, categoria, backend = 0, mulheresFront = 0, homensMobile = 0, mulheresFull = 0;

		Scanner sc = new Scanner(System.in);

		while (afirmacao == 1) {

			System.out.println("Digite a idade do colaborador:");
			idade = sc.nextInt();
			System.out.println("Digite o sexo do colaborador:\n1 - Masculino \n2 - Feminino \n3 - Outros");
			sexo = sc.nextInt();
			System.out
					.println("Digite o cargo do colaborador:\n1 - Backend \n2 - Frontend \n3 - Mobile \n4 - FullStack");
			categoria = sc.nextInt();

			if (categoria == 1) {
				backend++;
			} else if (sexo == 2 && categoria == 2) {
				mulheresFront++;
			} else if (idade >= 40 && sexo == 1 && categoria == 3) {
				homensMobile++;
			} else if (idade <= 30 && sexo == 2 && categoria == 4) {
				mulheresFull++;
			}

			System.out.println("Deseja continuar a leitura dos dados?");
			System.out.println("Digite 1 para sim OU 2 para não");
			afirmacao = sc.nextInt();
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.println();

		}
		
		System.out.println("O número de pessoas desenvolvedoras backend é:" + " " + backend);
		System.out.println("O número de mulheres desenvolvedoras frontend é:" + " " + mulheresFront);
		System.out.println("O número de homens desenvolvedores mobile maiores de 40 anos é:" + " " + homensMobile);
		System.out.println("O número de mulheres desenvolvedoras fullstack menores de 30 anos é:" + " " + mulheresFull);

	}

}
