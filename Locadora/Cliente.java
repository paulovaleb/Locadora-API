package pauloEduardoBorgesDoVale.Locadora;

public class Cliente {
	private String nome;
	private int cpf;
	
	public Cliente(String nome, int cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
