package pauloEduardoBorgesDoVale.Locadora;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteDaLocadora {
	@Test
	void testeFaturamentoTotal() throws VeiculoJaCadastrado, VeiculoNaoCadastrado, ClienteNaoCadastrado, VeiculoAlugado, VeiculoNaoAlugado, ClienteJaCadastrado {
		MinhaLocadora l = new MinhaLocadora();
		Carro c1 = new Carro("Estrela", "Antares", 1980, "C3PO", 20, 1000, 1);
		Carro c2 = new Carro("Estrela", "Antares", 1980, "C4PO", 30, 2000, 1);
		Moto m1 = new Moto("Estrela", "Antares", 1980, "Moto1", 20, 1000, 50);
		Moto m2 = new Moto("Estrela", "Antares", 1980, "Moto2", 20, 1000, 50);
		Caminhao cam1 = new Caminhao("Estrela", "Antares", 1980, "Cam1", 20, 1000, 50);
		Caminhao cam2 = new Caminhao("Estrela", "Antares", 1980, "Cam2", 20, 1000, 50);
		Onibus o1  = new Onibus("Estrela", "Antares", 1980, "Oni1", 20, 1000, 50);
		Onibus o2  = new Onibus("Estrela", "Antares", 1980, "Oni2", 20, 1000, 50);
		
		Cliente cl = new Cliente("Zé Carlos", 1234);
		l.inserir(cl);
		/*
		cam1.setValorAvaliado(1000);
		cam1.setValorDiaria(20);
		cam1.setPlaca("Cam1");
		
		cam2.setValorAvaliado(1000);
		cam2.setValorDiaria(20);
		cam2.setPlaca("Cam2");
		
		o1.setValorAvaliado(1000);
		o1.setValorDiaria(20);
		o1.setPlaca("Oni1");
		
		o2.setValorAvaliado(1000);
		o2.setValorDiaria(20);
		o2.setPlaca("Oni2");
		*/
		l.inserir(c1);
		l.inserir(c2);
		l.inserir(m1);
		l.inserir(m2);
		l.inserir(cam1);
		l.inserir(cam2);
		l.inserir(o1);
		l.inserir(o2);
		
		l.registrarAluguel("Cam2", 10, cl);
		l.registrarAluguel("Cam1", 10, cl);
		l.registrarDevolucao("Cam2", cl);
		l.registrarDevolucao("Cam1", cl);
		
		l.registrarAluguel("C3PO", 10, cl);
		l.registrarAluguel("C4PO", 10, cl);
		l.registrarDevolucao("C3PO", cl);
		l.registrarDevolucao("C4PO", cl);
		
		l.registrarAluguel("Moto1", 10, cl);
		l.registrarAluguel("Moto2", 10, cl);
		l.registrarDevolucao("Moto1", cl);
		l.registrarDevolucao("Moto2", cl);
		
		l.registrarAluguel("Oni1", 10, cl);
		l.registrarAluguel("Oni2", 10, cl);
		l.registrarDevolucao("Oni2", cl);
		l.registrarDevolucao("Oni1", cl);
		
		assertEquals(1723.832, l.faturamentoTotal(0), 0.01);
		assertEquals(406.027, l.faturamentoTotal(1), 0.01); 
		assertEquals(502.464, l.faturamentoTotal(2), 0.01);
		assertEquals(410.958, l.faturamentoTotal(3), 0.01); 
		assertEquals(404.383, l.faturamentoTotal(4), 0.01); 
		
	}
	
	@Test
	void testeQuantidadeTotalDeDiarias() throws VeiculoJaCadastrado, VeiculoNaoCadastrado, ClienteNaoCadastrado, VeiculoAlugado, VeiculoNaoAlugado, ClienteJaCadastrado {
		MinhaLocadora l = new MinhaLocadora();
		/*
		Carro c1 = new Carro("Estrela", "Antares", 1980, "Cam1", 20, 1000, 1);
		Carro c2 = new Carro("Estrela", "Antares", 1980, "Cam2", 20, 1000, 1);
		Moto m1 = new Moto();
		Moto m2 = new Moto();
		Caminhao cam1 = new Caminhao();
		Caminhao cam2 = new Caminhao();
		Onibus o1  = new Onibus();
		Onibus o2  = new Onibus();
		*/
		Carro c1 = new Carro("Estrela", "Antares", 1980, "C3PO", 20, 1000, 1);
		Carro c2 = new Carro("Estrela", "Antares", 1980, "C4PO", 30, 2000, 1);
		Moto m1 = new Moto("Estrela", "Antares", 1980, "Moto1", 30, 2000, 50);
		Moto m2 = new Moto("Estrela", "Antares", 1980, "Moto2", 30, 2000, 50);
		Caminhao cam1 = new Caminhao("Estrela", "Antares", 1980, "Cam1", 20, 2000, 50);
		Caminhao cam2 = new Caminhao("Estrela", "Antares", 1980, "Cam2", 20, 2000, 50);
		Onibus o1  = new Onibus("Estrela", "Antares", 1980, "Oni1", 20, 2000, 50);
		Onibus o2  = new Onibus("Estrela", "Antares", 1980, "Oni2", 20, 2000, 50);
		
		Cliente cl = new Cliente("Zé Carlos", 1234);
		l.inserir(cl);
		/*
		cam1.setValorAvaliado(1000);
		cam1.setValorDiaria(20);
		cam1.setPlaca("Cam1");
		
		cam2.setValorAvaliado(1000);
		cam2.setValorDiaria(20);
		cam2.setPlaca("Cam2");
		
		o1.setValorAvaliado(1000);
		o1.setValorDiaria(20);
		o1.setPlaca("Oni1");
		
		o2.setValorAvaliado(1000);
		o2.setValorDiaria(20);
		o2.setPlaca("Oni2");
	
		m1.setValorAvaliado(1000);
		m1.setValorDiaria(20);
		m1.setPlaca("Moto1");
		
		m2.setValorAvaliado(1000);
		m2.setValorDiaria(20);
		m2.setPlaca("Moto2");
		
		c1.setValorAvaliado(1000);
		c1.setValorDiaria(20);
		c1.setPlaca("C3PO");
		
		c2.setValorAvaliado(2000);
		c2.setValorDiaria(30);
		c2.setPlaca("C4PO");
		*/
		l.inserir(c1);
		l.inserir(c2);
		l.inserir(m1);
		l.inserir(m2);
		l.inserir(cam1);
		l.inserir(cam2);
		l.inserir(o1);
		l.inserir(o2);
		
		l.registrarAluguel("Cam2", 10, cl);
		l.registrarAluguel("Cam1", 10, cl);
		l.registrarDevolucao("Cam2", cl);
		l.registrarDevolucao("Cam1", cl);
		
		l.registrarAluguel("C3PO", 10, cl);
		l.registrarAluguel("C4PO", 10, cl);
		l.registrarDevolucao("C3PO", cl);
		l.registrarDevolucao("C4PO", cl);
		
		l.registrarAluguel("Moto1", 10, cl);
		l.registrarAluguel("Moto2", 10, cl);
		l.registrarDevolucao("Moto1", cl);
		l.registrarDevolucao("Moto2", cl);
		
		l.registrarAluguel("Oni1", 10, cl);
		l.registrarAluguel("Oni2", 10, cl);
		l.registrarDevolucao("Oni2", cl);
		l.registrarDevolucao("Oni1", cl);
		
		assertEquals(80, l.quantidadeTotalDeDiarias(0));
		assertEquals(20, l.quantidadeTotalDeDiarias(1)); 
		assertEquals(20, l.quantidadeTotalDeDiarias(2));
		assertEquals(20, l.quantidadeTotalDeDiarias(3)); 
		assertEquals(20, l.quantidadeTotalDeDiarias(4)); 
		
	}
	
	@Test
	void testePesquisar() throws VeiculoJaCadastrado, VeiculoNaoCadastrado {
		MinhaLocadora l = new MinhaLocadora();
		Carro c1 = new Carro("Estrela", "Antares", 1980, "CARRO1", 20, 1000, 1);
		Moto m1 = new Moto("Estrela", "Antares", 1980, "MOTO1", 30, 2000, 50);
		Moto m2 = new Moto("Estrela", "Antares", 1980, "MOTO2", 30, 2000, 50);
		Moto m3 = new Moto("Estrela", "Antares", 1980, "MOTO3", 30, 2000, 50);
		/*
		c1.setPlaca("CARRO1");
		m1.setPlaca("MOTO1");
		m2.setPlaca("MOTO2");
		m3.setPlaca("MOTO3");
		*/
		l.inserir(c1);
		l.inserir(m1);
		l.inserir(m2);
		l.inserir(m3);
		
		assertEquals("CARRO1", l.pesquisar("CARRO1").getPlaca());
		assertEquals("MOTO1", l.pesquisar("MOTO1").getPlaca());
		assertEquals("MOTO2", l.pesquisar("MOTO2").getPlaca());
		assertEquals("MOTO3", l.pesquisar("MOTO3").getPlaca());
		
	}
	@Test
	void testeConsultarAluguel() throws VeiculoJaCadastrado, VeiculoNaoCadastrado {
		MinhaLocadora l = new MinhaLocadora();
		Carro c1 = new Carro("Estrela", "Antares", 1980, "C3PO", 20, 1000, 1);
		
		l.inserir(c1);
		
		assertEquals(200.82, l.calcularAluguel("C3PO", 10), 0.01);
		
	}
	
	@Test
	void testeConsultarSeguro() throws VeiculoJaCadastrado, VeiculoNaoCadastrado {
		MinhaLocadora l = new MinhaLocadora();
		Carro c1 = new Carro("Estrela", "Antares", 1980, "C1PO", 20, 1000, 1);
		Moto m1= new Moto("Estrela", "Antares", 1980, "M2PO", 20, 1000, 1);
		Caminhao cam1 = new Caminhao("Estrela", "Antares", 1980, "CAM3PO", 20, 1000, 1);
		/*
		c1.setValorAvaliado(1000);
		c1.setValorDiaria(20);
		m1.setValorAvaliado(1000);
		m1.setValorDiaria(20);
		cam1.setValorAvaliado(1000);
		cam1.setValorDiaria(20);
		
		c1.setPlaca("C1PO");
		m1.setPlaca("M2PO");
		cam1.setPlaca("CAM3PO");
		*/
		l.inserir(c1);
		l.inserir(m1);
		l.inserir(cam1);
		
		assertEquals(0.082, l.consultarSeguro("C1PO"), 0.001);
		assertEquals(0.301, l.consultarSeguro("M2PO"), 0.001);
		assertEquals(0.219, l.consultarSeguro("CAM3PO"), 0.001);
		
	}
	
	
	@Test
	void testeDepreciarValor() throws VeiculoJaCadastrado {
		MinhaLocadora l = new MinhaLocadora();
		
		Caminhao cam1 = new Caminhao("Estrela", "Antares", 1980, "CAM1", 20, 1000, 1);
		Carro c1 = new Carro("Estrela", "Antares", 1980, "CAR1", 20, 1000, 1);
		Onibus o = new Onibus("Estrela", "Antares", 1980, "ONI1", 20, 1000, 1);
		Moto m1 = new Moto("Estrela", "Antares", 1980, "MOTO1", 20, 1000, 1);
		Moto m2 = new Moto("Estrela", "Antares", 1980, "MOTO2", 20, 2000, 1);
		Moto m3 = new Moto("Estrela", "Antares", 1980, "MOTO3", 20, 3000, 1);
		/*
		cam1.setValorAvaliado(1000);
		c1.setValorAvaliado(1000);
		o.setValorAvaliado(1000);
		m1.setValorAvaliado(1000);
		m2.setValorAvaliado(2000);
		m3.setValorAvaliado(3000);
		
		cam1.setPlaca("CAM1");
		c1.setPlaca("CAR1");
		o.setPlaca("ONI1");
		m1.setPlaca("MOTO1");
		m2.setPlaca("MOTO2");
		m3.setPlaca("MOTO3");
		*/
		l.inserir(m1);
		l.inserir(cam1);
		l.inserir(m2);
		l.inserir(o);
		l.inserir(m3);
		l.inserir(c1);
		
		
		l.depreciarVeiculos(0, 0.1);
		
		assertEquals(900, m1.getValorAvaliado(), 0.01);
		assertEquals(900, o.getValorAvaliado(), 0.01);
		assertEquals(900, c1.getValorAvaliado(), 0.01);
		assertEquals(900, cam1.getValorAvaliado(), 0.01);
		assertEquals(1800, m2.getValorAvaliado(), 0.01);
		assertEquals(2700, m3.getValorAvaliado(), 0.01);
		
	}
	
	@Test
	void testeAumentarDiaria() throws VeiculoJaCadastrado {
		MinhaLocadora l = new MinhaLocadora();
		
		Caminhao cam1 = new Caminhao("Estrela", "Antares", 1980, "CAM1", 100, 3000, 1);
		Carro c1 = new Carro("Estrela", "Antares", 1980, "CAR1", 100, 3000, 1);
		Onibus o = new Onibus("Estrela", "Antares", 1980, "ONI1", 100, 3000, 1);
		Moto m1 = new Moto("Estrela", "Antares", 1980, "MOTO1", 100, 3000, 1);
		Moto m2 = new Moto("Estrela", "Antares", 1980, "MOTO2", 200, 3000, 1);
		Moto m3 = new Moto("Estrela", "Antares", 1980, "MOTO3", 300, 3000, 1);
		/*
		cam1.setValorDiaria(100);
		c1.setValorDiaria(100);
		o.setValorDiaria(100);
		m1.setValorDiaria(100);
		m2.setValorDiaria(200);
		m3.setValorDiaria(300);
		/*
		cam1.setPlaca("CAM1");
		c1.setPlaca("CAR1");
		o.setPlaca("ONI1");
		m1.setPlaca("MOTO1");
		m2.setPlaca("MOTO2");
		m3.setPlaca("MOTO3");
		*/
		l.inserir(m1);
		l.inserir(cam1);
		l.inserir(m2);
		l.inserir(o);
		l.inserir(m3);
		l.inserir(c1);
		
		l.aumentarDiaria(0, 0.1);

		assertEquals(110, m1.getValorDiaria(), 0.01);
		assertEquals(110, o.getValorDiaria(), 0.01);
		assertEquals(110, c1.getValorDiaria(), 0.01);
		assertEquals(110, cam1.getValorDiaria(), 0.01);
		assertEquals(220, m2.getValorDiaria(), 0.01);
		assertEquals(330, m3.getValorDiaria(), 0.01);
		
	}

}
