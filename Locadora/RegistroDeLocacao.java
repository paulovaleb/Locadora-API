package pauloEduardoBorgesDoVale.Locadora;

public class RegistroDeLocacao {
	private Cliente cliente;
	private Veiculo veiculo;
	private int statusDeDevolucao = 0; //1 = devolvido, 0 = não devolvido.
	private int diasAlugado = 0;
	private double valorDaLocacao; //Valor a ser pago pela locacao.
	
	public double getValorDaLocacao() {
		return valorDaLocacao;
	}
	
	public void setValorDaLocacao(double valorDaLocacao) {
		this.valorDaLocacao = valorDaLocacao;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public int getStatusDeDevolucao() {
		return statusDeDevolucao;
	}
	public void setStatusDeDevolucao(int statusDeDevolucao) {
		this.statusDeDevolucao = statusDeDevolucao;
	}
	public int getDiasAlugado() {
		return diasAlugado;
	}

	public void setDiasAlugado(int diasAlugado) {
		this.diasAlugado = diasAlugado;
	}
	
	
}
