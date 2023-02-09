package lista1;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main (String [] args) {
		
		int anos,meses,dias, diasVividos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos:");
		anos=sc.nextInt();
		
		System.out.println("Digite quantos meses se passaram desde seu último mesversário:");
		meses=sc.nextInt();
		
		System.out.println("Digite quantos dias passaram desde o dia que você nasceu, neste mês:");
		dias=sc.nextInt();
		
		diasVividos = anos*365 + meses*30 + dias;
		
		System.out.println("Seus dias vividos são:" + diasVividos);
		
	}
	
}
  