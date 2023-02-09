package lista1;

import java.util.Scanner;


public class Exercicio4 {

	public static void main(String[] args) {
		
		int numeroA, numeroB, numeroC;
		double somaAB, somaBC, resultadoAB, resultadoBC, resultadoFinal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número na posição A:");
		numeroA=sc.nextInt();
		
		System.out.println("Digite o número na posição B:");
		numeroB=sc.nextInt();
		
		System.out.println("Digite o número na posição C:");
		numeroC=sc.nextInt();
		
		somaAB = numeroA + numeroB;
		somaBC = numeroB + numeroC;
		
		resultadoAB = Math.pow(somaAB, 2);
		resultadoBC = Math.pow(somaBC, 2);
		
		resultadoFinal = (resultadoAB + resultadoBC) /2;
		
		System.out.println("O resultado final da conta é:"+ resultadoFinal);
		
		
	}

}
