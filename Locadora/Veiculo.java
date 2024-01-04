package pauloEduardoBorgesDoVale.Locadora;

public abstract class Veiculo {
	//O metodo de calculo do seguro esta nas subclasses.
	private String marca;
	private String modelo;
	private int anoDeFabricacao;
	private String placa;
	protected double valorDiaria;
	protected double valorAvaliado;
	private int situacaoDeAluguel = 0; //1 = alugado, 0 = disponivel.
	
	public Veiculo(String marca, String modelo, int anoDeFabricacao, String placa, double valorDiaria,
			double valorAvaliado) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
		this.placa = placa;
		this.valorDiaria = valorDiaria;
		this.valorAvaliado = valorAvaliado;
	}

	abstract double getValorSeguro();
	
	public double getValorAluguel(int dias) {
		double valorAluguel = (valorDiaria + getValorSeguro())*dias;
		return valorAluguel;
	}
	
	public void alterarDiaria(double taxa) {
		valorDiaria += valorDiaria*taxa;
	}
	
	public void alterarValorAvaliado(double taxa) {
		valorAvaliado += valorAvaliado*taxa;
	}
	
	public int getSituacaoDeAluguel(){
		return situacaoDeAluguel;
	}

	public void setSituacaoDeAluguel(int situacaoDeAluguel) {
		this.situacaoDeAluguel = situacaoDeAluguel;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public double getValorAvaliado() {
		return valorAvaliado;
	}
	public void setValorAvaliado(double valorAvaliado) {
		this.valorAvaliado = valorAvaliado;
	}
	

	
}
