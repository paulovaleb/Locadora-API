package pauloEduardoBorgesDoVale.Locadora;

public class VeiculoNaoCadastrado extends Exception{
	public VeiculoNaoCadastrado(String placa) {
		super("O Veiculo de placa" + placa +"não está cadastrado.");
	}
}
