package pauloEduardoBorgesDoVale.Locadora;

public class Carro extends Veiculo{
	private int categoria; //Passeio, SUV ou Pick up.
	
	
	public Carro(String marca, String modelo, int anoDeFabricacao, String placa, double valorDiaria,
			double valorAvaliado, int cat) {
		super(marca, modelo, anoDeFabricacao, placa, valorDiaria, valorAvaliado);
		this.categoria = cat;
	}

	public double getValorSeguro() {
		double valorSeguro = valorAvaliado*0.03/365;
		return valorSeguro;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
}
