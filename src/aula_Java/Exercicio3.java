package aula_Java;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário bruto:");
		float salarioBruto=sc.nextFloat();
		
		System.out.println("Digite o adicional noturno:");
		float adicNoturno=sc.nextFloat();
		
		System.out.println("Digite as horas extras:");
		float horasExtras=sc.nextFloat();
		
		System.out.println("Digite os descontos:");
		float descontos=sc.nextFloat();
		
		float salarioLiquido= salarioBruto + adicNoturno + (horasExtras*5) - descontos;
		
		System.out.println("O salário líquido é de:" + salarioLiquido);
	}
	
}
