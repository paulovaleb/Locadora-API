package pauloEduardoBorgesDoVale.Locadora;

import java.util.ArrayList;
//Teste de PesquisarMotos FEITO
//Teste de PesquisarCarros FEITO
//Teste de PesquisarCaminhoes FEITO
//Teste de PesquisarOnibus  FEITO
public class UsoDeLocadora {
	public static void main(String[] args) throws VeiculoJaCadastrado {
			MinhaLocadora l = new MinhaLocadora();
			Carro c1 = new Carro("Estrela", "Antares", 1980, "CARRO1", 50, 20000, 1);
			Carro c2 = new Carro("Estrela", "Antares", 1980, "CARRO2", 50, 20000, 2);
			Onibus o1 = new Onibus("Estrela", "Antares", 1980, "ONIBUS1", 50, 20000, 100);
			Onibus o2 = new Onibus("Estrela", "Antares", 1980, "ONIBUS2", 50, 20000, 200);
			Onibus o3 = new Onibus("Estrela", "Antares", 1980, "ONIBUS3", 50, 20000, 300);
			
			Moto m1 = new Moto("Estrela", "Antares", 1980, "MOOT1", 50, 20000, 100);
			Moto m2 = new Moto("Estrela", "Antares", 1980, "MOOT2", 50, 20000, 200);
			Moto m3 = new Moto("Estrela", "Antares", 1980, "MOOT3", 50, 20000, 300);
			/*
			c1.setCategoria(1);
			c2.setCategoria(2);
			o1.setCapacidadePassageiros(100);
			o2.setCapacidadePassageiros(200);
			o3.setCapacidadePassageiros(300);
			
			c1.setPlaca("CARRO1");
			c2.setPlaca("CARRO2");
			o1.setPlaca("ONIBUS1");
			o2.setPlaca("ONIBUS2");
			o3.setPlaca("ONIBUS3");
			/*
			m1.setCilindrada(100);
			m2.setCilindrada(200);
			m3.setCilindrada(300);
			
			m1.setPlaca("MOOT1");
			m2.setPlaca("MOOT2");
			m3.setPlaca("MOOT3");
			*/
			
			l.inserir(c1);
			l.inserir(m1);
			l.inserir(c2);
			l.inserir(m2);
			l.inserir(o1);
			l.inserir(m3);
			l.inserir(o2);
			l.inserir(o3);
			/*
			ArrayList<Veiculo> aux = l.pesquisarMoto(100);
			for (Veiculo veiculo : aux) {
				System.out.println(veiculo.getPlaca());
			}*/
			
			ArrayList<Veiculo> aux = l.pesquisarOnibus(300);
			for (Veiculo veiculo : aux) {
				System.out.println(veiculo.getPlaca());
			}
	}
}
