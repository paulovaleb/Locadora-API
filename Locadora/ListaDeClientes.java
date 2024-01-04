package pauloEduardoBorgesDoVale.Locadora;
import java.util.ArrayList;

public class ListaDeClientes{
	private ArrayList<Cliente> vetor = new ArrayList<Cliente>();
	
	public void inserir(Cliente v) throws ClienteJaCadastrado{
		try {
			procurar(v.getCpf());
			throw new ClienteJaCadastrado(v.getNome());
		} catch (ClienteNaoCadastrado e) {
			vetor.add(v);
		}
	}
	
	public ArrayList<Cliente> getVetor() {
		return vetor;
	}

	public Cliente procurar(int cpf) throws ClienteNaoCadastrado {
    	for (Cliente cliente : vetor) {
			if(cliente.getCpf() == cpf) {
				return cliente;
			}
		}
    	throw new ClienteNaoCadastrado(cpf); 
    }
}
