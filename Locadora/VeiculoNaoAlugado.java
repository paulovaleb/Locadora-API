package pauloEduardoBorgesDoVale.Locadora;

public class VeiculoNaoAlugado extends Exception{
	public VeiculoNaoAlugado(String placa) {
		super("O veiculo de placa "+ placa+ " não foi alugado.");
	}
}
