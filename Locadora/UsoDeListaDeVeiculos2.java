package pauloEduardoBorgesDoVale.Locadora;

public class UsoDeListaDeVeiculos2 {

	//Teste de insercao de carros com mesma placa.
	public static void main(String[] args) throws VeiculoJaCadastrado {
		ListaDeVeiculos2 RepositorioDeVeiculos = new ListaDeVeiculos2();
		Carro c1 = new Carro("Estrela", "Antares", 1980, "C3PO", 40, 1000, 1);
		Moto m1 = new Moto("Estrela", "Antares", 1980, "C3PO", 40, 1000, 1);
		Moto m2 = new Moto("Estrela", "Antares", 1980, "C3PO", 40, 1000, 1);
		/*
		c1.setPlaca("C3PO");
		c1.setMarca("Hyundai");
		m1.setPlaca("C3PO");
		m1.setMarca("Audi");
		m2.setPlaca("C3PO");
		m2.setMarca("Fiat");
		*/
		RepositorioDeVeiculos.inserir(m2);
		try {
		RepositorioDeVeiculos.inserir(m1);
		}catch(VeiculoJaCadastrado e) {
			
		}
		try {
			RepositorioDeVeiculos.inserir(c1);
		}catch(VeiculoJaCadastrado e) {
				
		}
		
		
		
		for (Veiculo veiculo : RepositorioDeVeiculos.getVetor()) {
			System.out.println(veiculo.getPlaca() + "->" + veiculo.getMarca());
		}
		
	}

}
