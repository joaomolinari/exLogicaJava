package lacosCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int a,b,c, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		a=sc.nextInt();
		
		System.out.println("Digite o valor de B:");
		b=sc.nextInt();
		
		System.out.println("Digite o valor de C:");
		c=sc.nextInt();
		
		soma = a+b;
		
		if (soma>c) {
			System.out.println("A soma de A+B é maior que o valor de C");
		} else if (soma<c) {
			System.out.println("A soma de A+B é menor que o valor de C");
		}
		else if (soma==c) {
			System.out.println("A soma de A+B é igual ao valor de C");
		}
	
	}

}
