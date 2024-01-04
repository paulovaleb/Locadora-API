package pauloEduardoBorgesDoVale.Locadora;
import java.util.ArrayList;

public class MinhaLocadora implements Locadora{
	private ListaDeVeiculos2 RepositorioDeVeiculos = new ListaDeVeiculos2();
	private ListaDeClientes RepositorioDeClientes = new ListaDeClientes();
	//Guarda cada locacao ou devolucao de um veiculo.
	private ArrayList<RegistroDeLocacao> vetorDeRegistrosDeLocacao = new ArrayList<RegistroDeLocacao>();
	
	
	public double faturamentoTotal(int tipo) {
		double faturamento = 0;
		switch(tipo) {
			case 0:
				for (RegistroDeLocacao registroDeLocacao : vetorDeRegistrosDeLocacao) {
					/*
					if(registroDeLocacao.getStatusDeDevolucao() == 1) {
						faturamento += registroDeLocacao.getValorDaLocacao();
					}
					*/
					faturamento += registroDeLocacao.getValorDaLocacao();
					
				}
				return faturamento;
			case 1:
				
				for (RegistroDeLocacao registroDeLocacao : vetorDeRegistrosDeLocacao) {
					/*
					if(registroDeLocacao.getVeiculo() instanceof Moto && registroDeLocacao.getStatusDeDevolucao() == 1) {
						faturamento += registroDeLocacao.getValorDaLocacao();
					}
					*/
					if(registroDeLocacao.getVeiculo() instanceof Moto) {
						faturamento += registroDeLocacao.getValorDaLocacao();
					}
				}
				return faturamento;
			case 2:
				for (RegistroDeLocacao registroDeLocacao : vetorDeRegistrosDeLocacao) {
					/*
					if(registroDeLocacao.getVeiculo() instanceof Carro && registroDeLocacao.getStatusDeDevolucao() == 1) {
						faturamento += registroDeLocacao.getValorDaLocacao();
					}
					*/
					if(registroDeLocacao.getVeiculo() instanceof Carro) {
						faturamento += registroDeLocacao.getValorDaLocacao();
					}
				}
				return faturamento;
				case 3:
					for (RegistroDeLocacao registroDeLocacao : vetorDeRegistrosDeLocacao) {
						/*
						if(registroDeLocacao.getVeiculo() instanceof Caminhao && registroDeLocacao.getStatusDeDevolucao() == 1) {
							faturamento += registroDeLocacao.getValorDaLocacao();
						}
						*/
						if(registroDeLocacao.getVeiculo() instanceof Caminhao ) {
							faturamento += registroDeLocacao.getValorDaLocacao();
						}
					}
					return faturamento;
			case 4:
				for (RegistroDeLocacao registroDeLocacao : vetorDeRegistrosDeLocacao) {
					/*
					if(registroDeLocacao.getVeiculo() instanceof Onibus && registroDeLocacao.getStatusDeDevolucao() == 1) {
						faturamento += registroDeLocacao.getValorDaLocacao();
					}
					*/
					if(registroDeLocacao.getVeiculo() instanceof Onibus ) {
						faturamento += registroDeLocacao.getValorDaLocacao();
					}
				}
				return faturamento;
		}
		return faturamento;
	}
	
	
	public int quantidadeTotalDeDiarias(int tipo) {
		int totalDeDiarias = 0;
		switch(tipo) {
			case 0:
				for (RegistroDeLocacao registroDeLocacao : vetorDeRegistrosDeLocacao) {
					/*
					if(registroDeLocacao.getStatusDeDevolucao() == 1) {
						totalDeDiarias += registroDeLocacao.getDiasAlugado();
					}
					*/
					
					totalDeDiarias += registroDeLocacao.getDiasAlugado();
					
				}
				return totalDeDiarias;
			case 1:
				for (RegistroDeLocacao registroDeLocacao : vetorDeRegistrosDeLocacao) {
					/*
					if(registroDeLocacao.getVeiculo() instanceof Moto && registroDeLocacao.getStatusDeDevolucao() == 1) {
						totalDeDiarias += registroDeLocacao.getDiasAlugado();
					}
					*/
					if(registroDeLocacao.getVeiculo() instanceof Moto ) {
						totalDeDiarias += registroDeLocacao.getDiasAlugado();
					}
				}
				return totalDeDiarias;
			case 2:
				for (RegistroDeLocacao registroDeLocacao : vetorDeRegistrosDeLocacao) {
					/*
					if(registroDeLocacao.getVeiculo() instanceof Carro && registroDeLocacao.getStatusDeDevolucao() == 1) {
						totalDeDiarias += registroDeLocacao.getDiasAlugado();
					}
					*/
					if(registroDeLocacao.getVeiculo() instanceof Carro ) {
						totalDeDiarias += registroDeLocacao.getDiasAlugado();
					}
				}
				return totalDeDiarias;
			case 3:
				for (RegistroDeLocacao registroDeLocacao : vetorDeRegistrosDeLocacao) {
					/*
					if(registroDeLocacao.getVeiculo() instanceof Caminhao && registroDeLocacao.getStatusDeDevolucao() == 1) {
						totalDeDiarias += registroDeLocacao.getDiasAlugado();
					}
					*/
					if(registroDeLocacao.getVeiculo() instanceof Caminhao ) {
						totalDeDiarias += registroDeLocacao.getDiasAlugado();
					}
				}
				return totalDeDiarias;
			case 4:
				for (RegistroDeLocacao registroDeLocacao : vetorDeRegistrosDeLocacao) {
					/*
					if(registroDeLocacao.getVeiculo() instanceof Onibus && registroDeLocacao.getStatusDeDevolucao() == 1) {
						totalDeDiarias += registroDeLocacao.getDiasAlugado();
					}
					*/
					if(registroDeLocacao.getVeiculo() instanceof Onibus ) {
						totalDeDiarias += registroDeLocacao.getDiasAlugado();
					}
				}
				return totalDeDiarias;
		}
		return totalDeDiarias;
	}
	
	
	public void registrarAluguel(String placa, int dias, Cliente c) throws VeiculoNaoCadastrado, ClienteNaoCadastrado, VeiculoAlugado{
		Veiculo aux = pesquisar(placa);
		RepositorioDeClientes.procurar(c.getCpf());
		
		if(aux.getSituacaoDeAluguel() == 0) {
			aux.setSituacaoDeAluguel(1);
			RegistroDeLocacao registroDeLocacao = new RegistroDeLocacao();
			registroDeLocacao.setCliente(c);
			registroDeLocacao.setVeiculo(aux);
			registroDeLocacao.setValorDaLocacao(aux.getValorAluguel(dias));
			registroDeLocacao.setDiasAlugado(dias);
			vetorDeRegistrosDeLocacao.add(registroDeLocacao);
		}else {
			throw new VeiculoAlugado(aux.getPlaca());
		}
	}
	
	
	public void registrarDevolucao(String placa, Cliente c) throws VeiculoNaoCadastrado, VeiculoNaoAlugado, ClienteNaoCadastrado {
		Veiculo aux = pesquisar(placa);
		RepositorioDeClientes.procurar(c.getCpf());
		
		if(aux.getSituacaoDeAluguel() == 1) {
			aux.setSituacaoDeAluguel(0);
			for (RegistroDeLocacao registroDeLocacao : vetorDeRegistrosDeLocacao) {
				if(registroDeLocacao.getVeiculo().getPlaca() == placa) {
					registroDeLocacao.setStatusDeDevolucao(1);
				}
			}
		}else {
			throw new VeiculoNaoAlugado(placa);
		}
	}
	
	public void cadastrarVeiculo(Veiculo v) throws VeiculoJaCadastrado{
		RepositorioDeVeiculos.inserir(v);
	}
	
	public void inserir(Veiculo v) throws VeiculoJaCadastrado{
		RepositorioDeVeiculos.inserir(v);
	}
	
	public void inserir(Cliente c) throws ClienteJaCadastrado{
		RepositorioDeClientes.inserir(c);
	}
	
	public Veiculo pesquisar(String placa) throws VeiculoNaoCadastrado {
		RepositorioDeVeiculos.procurar(placa);
		return RepositorioDeVeiculos.procurar(placa);
		
	} 
	
	//Recebe a placa do veiculo e os dias para alugar.
	//Retorna aluguel para a quantidade de dias/.
	public double calcularAluguel(String placa, int dias) throws VeiculoNaoCadastrado {
		Veiculo aux = RepositorioDeVeiculos.procurar(placa);
		return aux.getValorAluguel(dias);
	}
	
	public double consultarSeguro(String placa) throws VeiculoNaoCadastrado {
		Veiculo aux = RepositorioDeVeiculos.procurar(placa);
		return aux.getValorSeguro();
	}
	//O metodo pode ser usado para depreciar ou aumentar o valor. Depende do sinal da taxa.
	public void depreciarVeiculos(int tipo, double taxaDeDepreciacao) {
		switch(tipo){
			case 0:
				for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
					veiculo.alterarValorAvaliado(-1*taxaDeDepreciacao);
				}
				break;
			case 1:
				for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
					if(veiculo instanceof Moto) {
						veiculo.alterarValorAvaliado(-1*taxaDeDepreciacao);
					}
				}
				break;
			case 2:
				for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
					if(veiculo instanceof Carro) {
						veiculo.alterarValorAvaliado(-1*taxaDeDepreciacao);
					}
				}
				break;
			case 3:
				for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
					if(veiculo instanceof Caminhao) {
						veiculo.alterarValorAvaliado(-1*taxaDeDepreciacao);
					}
				}
				break;
			case 4:
				for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
					if(veiculo instanceof Onibus) {
						veiculo.alterarValorAvaliado(-1*taxaDeDepreciacao);
					}
				}
				break;
		}
	}
	
	//Pode aumentar ou diminuir diaria. Depende do sinal da Taxa
	public void aumentarDiaria(int tipo, double taxaAumento) {
		switch(tipo){
			case 0:
				for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
					veiculo.alterarDiaria(taxaAumento);
				}
			break;
			case 1:
				for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
					if(veiculo instanceof Moto) {
						veiculo.alterarDiaria(taxaAumento);
					}
				}
				break;
			case 2:
				for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
					if(veiculo instanceof Carro) {
						veiculo.alterarDiaria(taxaAumento);
					}
				}
				break;
			case 3:
				for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
					if(veiculo instanceof Caminhao) {
						veiculo.alterarDiaria(taxaAumento);
					}
				}
				break;
			case 4:
				for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
					if(veiculo instanceof Onibus) {
						veiculo.alterarDiaria(taxaAumento);
					}
				}
				break;
		}
	}
	
	//Retorna Array de Motos com cilindrada maior ou igual ao valor inserido
	 public ArrayList<Veiculo> pesquisarMoto(int cilindrada) {
		 ArrayList<Veiculo> ArrayDeMotos = new ArrayList<Veiculo>();
		 for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
				if(veiculo instanceof Moto && ((Moto) veiculo).getCilindrada() == cilindrada) {
					ArrayDeMotos.add(veiculo);
				}
			}
		 return ArrayDeMotos;
	}
	 public ArrayList<Veiculo> pesquisarCarro(int tipoCarro) {
		 ArrayList<Veiculo> ArrayDeCarros = new ArrayList<Veiculo>();
		 for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
				if(veiculo instanceof Carro && ((Carro) veiculo).getCategoria() == tipoCarro) {
					ArrayDeCarros.add(veiculo);
				}
			}
		 return ArrayDeCarros;
	}
	 public ArrayList<Veiculo> pesquisarCaminhao(int carga) {
		 ArrayList<Veiculo> ArrayDeCaminhoes = new ArrayList<Veiculo>();
		 for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
				if(veiculo instanceof Caminhao && ((Caminhao) veiculo).getCapacidadeDeCarga() == carga) {
					ArrayDeCaminhoes.add(veiculo);
				}
			}
		 return ArrayDeCaminhoes;
	}
	 public ArrayList<Veiculo> pesquisarOnibus(int passageiros) {
		 ArrayList<Veiculo> ArrayDeOnibus = new ArrayList<Veiculo>();
		 for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
				if(veiculo instanceof Onibus && ((Onibus) veiculo).getCapacidadePassageiros() == passageiros) {
					ArrayDeOnibus.add(veiculo);
				}
			}
		 return ArrayDeOnibus;
	}
}
