package aula_Java;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota:");
		float nota1=sc.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		float nota2=sc.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		float nota3=sc.nextFloat();
		
		System.out.println("Digite a quarta nota:");
		float nota4=sc.nextFloat();
		
	    float media=(nota1+nota2+nota3+nota4) /4;
	    
	    System.out.printf("A média do aluno foi de: %.2f",media);

	}

}
