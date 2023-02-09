package lista1;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main (String [] args) {
		
		double x1, y1, x2, y2, distancia;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de x1:");
		x1=sc.nextDouble();
		
		System.out.println("Digite o valor de y1:");
		y1=sc.nextDouble();
		
		System.out.println("Digite o valor de x2:");
		x2=sc.nextDouble();
		
		System.out.println("Digite o valor de y2:");
		y2=sc.nextDouble();
		
		distancia = Math.sqrt(Math.pow (x2 - x1 , y2 - y1));
		
		System.out.println("A distância é de:" + distancia);
		
	}

}
