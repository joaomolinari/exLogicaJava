package POO_1;

public class Cliente {
	
	private String nome;
	private int idade;
	private int aniversario;
	private int cpf_cliente;
	
	public Cliente(String nome, int idade, int aniversario, int cpf_cliente) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.aniversario = aniversario;
		this.cpf_cliente = cpf_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	public int getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(int cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}
	
	public void visualizar() {
		
		System.out.println("\nNome:"+nome+"\nIdade:"+idade+"\nAniversario:"+aniversario+"\nCPF:"+cpf_cliente);
		
	}

}
