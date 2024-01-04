package pauloEduardoBorgesDoVale.Locadora;
import java.util.ArrayList;

public class ListaDeVeiculos2{
	private ArrayList<Veiculo> vetor = new ArrayList<Veiculo>();
	
	//Como usar o método pesquisar dessa classe no método inserir, 
	//se ao não encontrar um veículo a primeira deve levantar uma excessão?
	public void inserir(Veiculo v) throws VeiculoJaCadastrado{
		try {
			procurar(v.getPlaca());
			throw new VeiculoJaCadastrado(v.getPlaca());
		} catch (VeiculoNaoCadastrado e) {
			vetor.add(v);
		}
	}
	
	public ArrayList<Veiculo> getVetor() {
		return vetor;
	}

	public Veiculo procurar(String placa) throws VeiculoNaoCadastrado{
    	for (Veiculo veiculo : vetor) {
			if(veiculo.getPlaca() == placa) {
				return veiculo;
			}
		}
    	throw new VeiculoNaoCadastrado(placa);
    }

}
