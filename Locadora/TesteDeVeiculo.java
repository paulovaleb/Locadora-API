package pauloEduardoBorgesDoVale.Locadora;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteDeVeiculo {

	@Test
	void testeDeValorSeguro() {
		Carro c1 = new Carro("Estrela", "Antares", 1980, "A-100", 20, 1000, 1);
		Moto m1 = new Moto("Estrela", "Antares", 1980, "A-100", 20, 1000, 1);
		Caminhao cam1 = new Caminhao("Estrela", "Antares", 1980, "A-100", 20, 1000, 1);
		Onibus o1 = new Onibus("Estrela", "Antares", 1980, "A-100", 20, 1000, 1);
		/*
		c1.setValorAvaliado(1000);
		c1.setValorDiaria(20);
		m1.setValorAvaliado(1000);
		m1.setValorDiaria(20);
		cam1.setValorAvaliado(1000);
		cam1.setValorDiaria(20);
		o1.setValorAvaliado(1000);
		o1.setValorDiaria(20);
		*/
		assertEquals(0.082, c1.getValorSeguro(), 0.001);
		assertEquals(0.301, m1.getValorSeguro(), 0.001);
		assertEquals(0.219, cam1.getValorSeguro(), 0.001);
		assertEquals(0.547, o1.getValorSeguro(), 0.001);
		
	}
	
	@Test
	void testeDeValorAluguel() {
		Carro c1 = new Carro("Estrela", "Antares", 1980, "A-100", 20, 1000, 1);
		Moto m1 = new Moto("Estrela", "Antares", 1980, "A-100", 20, 1000, 1);
		Caminhao cam1 = new Caminhao("Estrela", "Antares", 1980, "A-100", 20, 1000, 1);
		Onibus o1 = new Onibus("Estrela", "Antares", 1980, "A-100", 20, 1000, 1);
		/*
		c1.setValorAvaliado(1000);
		c1.setValorDiaria(20);
		m1.setValorAvaliado(1000);
		m1.setValorDiaria(20);
		cam1.setValorAvaliado(1000);
		cam1.setValorDiaria(20);
		o1.setValorAvaliado(1000);
		o1.setValorDiaria(20);
		*/
		assertEquals(200.82, c1.getValorAluguel(10), 0.01);
		assertEquals(203.01, m1.getValorAluguel(10), 0.01);
		assertEquals(202.19, cam1.getValorAluguel(10), 0.01);
		assertEquals(205.47, o1.getValorAluguel(10), 0.01);
		
	}
	
	@Test
	void testeDeDiaria() {
		Carro c1 = new Carro("Estrela", "Antares", 1980, "A-100", 10, 1000, 1);
		Moto m1 = new Moto("Estrela", "Antares", 1980, "A-100", 20, 1000, 1);
		Caminhao cam1 = new Caminhao("Estrela", "Antares", 1980, "A-100", 30, 1000, 1);
		Onibus o1 = new Onibus("Estrela", "Antares", 1980, "A-100", 40, 1000, 1);
		
		//c1.setValorDiaria(10);
		c1.alterarDiaria(0.1);
		//m1.setValorDiaria(20);
		m1.alterarDiaria(0.1);
		//cam1.setValorDiaria(30);
		cam1.alterarDiaria(0.1);
		//o1.setValorDiaria(40);
		o1.alterarDiaria(0.1);
		
		assertEquals(11, c1.getValorDiaria(), 0.01);
		assertEquals(22, m1.getValorDiaria(), 0.01);
		assertEquals(33, cam1.getValorDiaria(), 0.01);
		assertEquals(44, o1.getValorDiaria(), 0.01);
		
		c1.setValorDiaria(10);
		c1.alterarDiaria(-0.1);
		m1.setValorDiaria(20);
		m1.alterarDiaria(-0.1);
		cam1.setValorDiaria(30);
		cam1.alterarDiaria(-0.1);
		o1.setValorDiaria(40);
		o1.alterarDiaria(-0.1);
		
		assertEquals(9, c1.getValorDiaria(), 0.01);
		assertEquals(18, m1.getValorDiaria(), 0.01);
		assertEquals(27, cam1.getValorDiaria(), 0.01);
		assertEquals(36, o1.getValorDiaria(), 0.01);
		
	}
	
	@Test
	void testeDeValorAvaliado() {
		Carro c1 = new Carro("Estrela", "Antares", 1980, "A-100", 40, 1000, 1);
		Moto m1 = new Moto("Estrela", "Antares", 1980, "A-100", 40, 2000, 1);
		Caminhao cam1 = new Caminhao("Estrela", "Antares", 1980, "A-100", 40, 3000, 1);
		Onibus o1 = new Onibus("Estrela", "Antares", 1980, "A-100", 40, 4000, 1);
		
		//c1.setValorAvaliado(1000);
		c1.alterarValorAvaliado(0.1);
		//m1.setValorAvaliado(2000);
		m1.alterarValorAvaliado(0.1);
		//cam1.setValorAvaliado(3000);
		cam1.alterarValorAvaliado(0.1);
		//o1.setValorAvaliado(4000);
		o1.alterarValorAvaliado(0.1);
		
		assertEquals(1100, c1.getValorAvaliado(), 0.01);
		assertEquals(2200, m1.getValorAvaliado(), 0.01);
		assertEquals(3300, cam1.getValorAvaliado(), 0.01);
		assertEquals(4400, o1.getValorAvaliado(), 0.01);
		
		c1.setValorAvaliado(1000);
		c1.alterarValorAvaliado(-0.1);
		m1.setValorAvaliado(2000);
		m1.alterarValorAvaliado(-0.1);
		cam1.setValorAvaliado(3000);
		cam1.alterarValorAvaliado(-0.1);
		o1.setValorAvaliado(4000);
		o1.alterarValorAvaliado(-0.1);
		
		assertEquals(900, c1.getValorAvaliado(), 0.01);
		assertEquals(1800, m1.getValorAvaliado(), 0.01);
		assertEquals(2700, cam1.getValorAvaliado(), 0.01);
		assertEquals(3600, o1.getValorAvaliado(), 0.01);
		
	}

}
