package pauloEduardoBorgesDoVale.Locadora;

public class VeiculoAlugado extends Exception{
	public VeiculoAlugado(String placa) {
		super("O veiculo de placa "+ placa+ " já está alugado.");
	}
}
