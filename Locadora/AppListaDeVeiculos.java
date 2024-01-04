package pauloEduardoBorgesDoVale.Locadora;

public class AppListaDeVeiculos {

	public static void main(String[] args) throws VeiculoJaCadastrado {
		ListaDeVeiculos2 RepositorioDeVeiculos = new ListaDeVeiculos2();
		
		Moto m1 = new Moto("Estrela", "Antares", 1980, "C3PO", 50, 20000, 1);
		Carro c1 = new Carro("Estrela", "Antares", 1980, "C3PO", 50, 20000, 1);
		
		m1.setPlaca("C3PO");
		c1.setPlaca("C3PO");
		
		RepositorioDeVeiculos.inserir(m1);
		try {
			RepositorioDeVeiculos.inserir(c1);
		}catch(VeiculoJaCadastrado e) {
			
		}
		for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
			System.out.println(veiculo.getPlaca());
		}
			
	}
	

}

