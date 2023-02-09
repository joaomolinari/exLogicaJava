package lista1;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main (String [] args) {
		
		int anos,meses,dias, mesesVividos, diasVividos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos:");
		anos=sc.nextInt();
		
		System.out.println("Digite quantos meses se passaram desde seu último mesversário:");
		meses=sc.nextInt();
		
		System.out.println("Digite quantos dias passaram desde o dia de seu aniversário, neste mês:");
		dias=sc.nextInt();
		
		mesesVividos = anos*12;
		diasVividos = anos*365 + meses*30 + dias;
		
		System.out.println("Seus anos vividos são:" + anos);
		System.out.println("Seus meses vividos são:" + mesesVividos);
		System.out.println("Seus dias vividos são:" + diasVividos);
		
	}
	
}
