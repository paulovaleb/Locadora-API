package pauloEduardoBorgesDoVale.Locadora;

public class ClienteNaoCadastrado extends Exception{
	public ClienteNaoCadastrado(int cpf) {
		super("Cliente de cpf "+ cpf+ " não foi cadastrado");
	}
}
