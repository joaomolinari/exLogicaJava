package testeCliente;

import POO_1.Cliente;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente[] lista = new Cliente[3];

		lista[0] = new Cliente("João Vitor", 19, 9, 123456789);
		lista[1] = new Cliente("Augustinho", 20, 10, 357891422);
		lista[2] = new Cliente("Audrey", 21, 11, 754209268);

		for (Cliente roda : lista) {
			roda.visualizar();
		}
		
	}

}
