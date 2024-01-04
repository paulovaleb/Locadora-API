package pauloEduardoBorgesDoVale.Locadora;

public class VeiculoJaCadastrado extends Exception{
	
	public VeiculoJaCadastrado(String placa){
		super("O Veiculo de placa" + placa +"já está cadastrado.");
	}
}
