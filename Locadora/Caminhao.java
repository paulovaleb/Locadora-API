package pauloEduardoBorgesDoVale.Locadora;

public class Caminhao extends Veiculo{
	private double capacidadeDeCarga;
	
	public Caminhao(String marca, String modelo, int anoDeFabricacao, String placa, double valorDiaria,
			double valorAvaliado, double capDeCarga) {
		super(marca, modelo, anoDeFabricacao, placa, valorDiaria, valorAvaliado);
		this.capacidadeDeCarga = capDeCarga;
	}

	public double getValorSeguro() {
		double valorSeguro = valorAvaliado*0.08/365;
		return valorSeguro;
	}

	public double getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(double capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
}
