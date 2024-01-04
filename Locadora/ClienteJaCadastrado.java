package pauloEduardoBorgesDoVale.Locadora;

public class ClienteJaCadastrado extends Exception{
	public ClienteJaCadastrado(String nome) {
		super("Cliente"+ nome+ "já foi cadastrado");
	}
}
