package testaLoja;

import POO_2.LojaGames;

public class TestaLoja {

	public static void main(String[] args) {

		LojaGames[] lista = new LojaGames[3];

		lista[0] = new LojaGames("Teclado", 100, 1, 123);
		lista[1] = new LojaGames("Mouse", 50, 2, 456);
		lista[2] = new LojaGames("Fone", 40, 3, 789);

		for (LojaGames roda : lista) {
			roda.visualizar();
		}

	}

}
