package POO_2;

public class LojaGames {
	
	private String produto;
	private int valor;
	private int identificacao;
	private int numeroSerie;
	
	public LojaGames(String produto, int valor, int identificacao, int numeroSerie) {
		super();
		this.produto = produto;
		this.valor = valor;
		this.identificacao = identificacao;
		this.numeroSerie = numeroSerie;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	public void visualizar() {
		System.out.println("\nProduto:"+produto+"\nValor:"+valor+"R$"+"\nIdentificação:"+identificacao+"\nNúmero de Série:"+numeroSerie);
	}

}
