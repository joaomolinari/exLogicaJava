package lista1;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String[] args) {
		
		double horas, minutos, segundos, tempoDuracao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo de duração do evento em segundos");
		segundos=sc.nextDouble();
		
		horas = segundos/3600;
		minutos = segundos/60;
		
		System.out.println("A duração do evento em horas foi de:"+horas + " " + "h");
		System.out.println("A duração do evento em minutos foi de:"+minutos + " " + "min");
		System.out.println("A duração do evento em segundos foi de:"+segundos + " " + "s");
	}

}
