package aula_Java;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String [] args) {
		
		int n1,n2,n3,n4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		n1=sc.nextInt();
		
		System.out.println("Digite o segundo valor:");
		n2=sc.nextInt();
		
		System.out.println("Digite o terceiro valor:");
		n3=sc.nextInt();
		
		System.out.println("Digite o quarto valor:");
		n4=sc.nextInt();
		
		int resultDiferenca= (n1 * n2) - (n3 * n4);
		
		System.out.println("O resultado da diferença entre o produto n1 e n2 pelo produto n3 e n4 é:"+ resultDiferenca);
		
		
	}

}
