package pauloEduardoBorgesDoVale.Locadora;

public class Onibus extends Veiculo{
	private int capacidadePassageiros;
	
	public Onibus(String marca, String modelo, int anoDeFabricacao, String placa, double valorDiaria,
			double valorAvaliado, int capacidade) {
		super(marca, modelo, anoDeFabricacao, placa, valorDiaria, valorAvaliado);
		this.capacidadePassageiros = capacidade;
	}

	public double getValorSeguro() {
		double valorSeguro = valorAvaliado*0.2/365;
		return valorSeguro;
	}

	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}

	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}
}
