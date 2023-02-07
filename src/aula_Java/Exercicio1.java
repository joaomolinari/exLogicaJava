package aula_Java;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite o salário:");
		float salario=sc.nextFloat();
		
		System.out.println("Digite o abono:");
		float abono=sc.nextFloat();
		
		float novoSalario= salario+abono;
		
		System.out.println("O novo salário é:" + novoSalario);
		
		}

}
