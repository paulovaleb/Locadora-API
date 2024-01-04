package pauloEduardoBorgesDoVale.Locadora;

public class Moto extends Veiculo{
	private int cilindrada; //Em centimetro cúbico
	
	public Moto(String marca, String modelo, int anoDeFabricacao, String placa, double valorDiaria,
			double valorAvaliado, int cil) {
		super(marca, modelo, anoDeFabricacao, placa, valorDiaria, valorAvaliado);
		this.cilindrada = cil;
	}

	public double getValorSeguro() {
		double valorSeguro = valorAvaliado*0.11/365;
		return valorSeguro;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
}
