package pauloEduardoBorgesDoVale.Locadora;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteDeListaDEVeiculos {

	@Test
	void testeInsercaDeVeiculosComMesmaPlaca() throws VeiculoJaCadastrado, VeiculoNaoCadastrado {
		ListaDeVeiculos2 RepositorioDeVeiculos = new ListaDeVeiculos2();
		Veiculo aux;
		Carro c1 = new Carro("Estrela", "Antares", 1980, "C3PO", 50, 20000, 1);
		Moto m1 = new Moto("Estrela", "Antares", 1980, "C3PO", 50, 20000, 1);
		
		c1.setPlaca("C3PO");
		m1.setPlaca("C3PO");
		
		RepositorioDeVeiculos.inserir(m1);
		try {
			// Testando inserir veículo de mesma placa
			RepositorioDeVeiculos.inserir(c1);
			fail("Exceção VeiculoJaCadastrado era esperada");
		} catch (VeiculoJaCadastrado e) {
			// Ok, exceção era esperada
		}
		
		aux = RepositorioDeVeiculos.procurar("C3PO");
		assertEquals("C3PO", aux.getPlaca());
	}

}
