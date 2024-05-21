package br.com.claracastelo.ProjetoCarro.model;

import org.junit.Assert;
import org.junit.Test;

public class CarroTest {
	
	
	@Test
	public void testLigarMotor() {
		
		//Cenário
		String carro1 = "Gol";
		String carro2 = "Uno";
		String carro3 = "Fusca";
		
		Carro c1 = new Carro("Volkswagen", carro1, 2000, false, 0);
		Carro c2 = new Carro("Fiat", carro2, 2000, true, 0);
		Carro c3 = new Carro("Volkswagen", carro3, 2000, true, 60);
		
		//Ação
		//System.out.println(c1.situacaoMotor());
		//System.out.println(c2.situacaoMotor());
		//System.out.println(c3.situacaoMotor());
		
		//Verificação
		Assert.assertEquals("O motor do " + carro1 + " foi ligado agora.", c1.ligarMotor());
		Assert.assertEquals("O motor do " + carro2 + " já estava ligado.", c2.ligarMotor());
		Assert.assertEquals("O motor do " + carro2 + " já estava ligado.", c2.ligarMotor());
	}
	
	@Test
	public void testDesligarMotor() {
		
		//Cenário
		String carro1 = "Gol";
		String carro2 = "Uno";
		String carro3 = "Fusca";
		
		Carro c1 = new Carro("Volkswagen", carro1, 2000, false, 0);
		Carro c2 = new Carro("Fiat", carro2, 2000, true, 0);
		Carro c3 = new Carro("Volkswagen", carro3, 2000, true, 60);
		
		//Ação
		//System.out.println(c1.situacaoMotor());
		//System.out.println(c2.situacaoMotor());
		//System.out.println(c3.situacaoMotor());
		
		//Verificação
		Assert.assertEquals("O motor do " + carro1 + " já estava desligado.", c1.desligarMotor());
		Assert.assertEquals("O motor do " + carro2 + " foi desligado agora.", c2.desligarMotor());
		Assert.assertEquals("ATENÇÃO: O motor do " + carro3 + " não foi desligado pois o carro está em movimento.", c3.desligarMotor());
	}
	
	@Test
	public void testAcelerar() {
		
		//Cenário
		String carro1 = "Gol";
		String carro2 = "Uno";
		String carro3 = "Fusca";
		
		Carro c1 = new Carro("Volkswagen", carro1, 2000, false, 0);
		Carro c2 = new Carro("Fiat", carro2, 2000, true, 0);
		Carro c3 = new Carro("Volkswagen", carro3, 2000, true, 60);
		
		//Ação
		System.out.println(c1.situacaoMotor());
		System.out.println(c2.situacaoMotor());
		System.out.println(c3.situacaoMotor());
		
		//Verificação
		Assert.assertEquals(c1.acelerar(20), carro1 + " --> ATENÇÃO: Não é possível acelerar com o motor desligado!");
		Assert.assertEquals(c2.acelerar(20), carro2 + " --> ACELEROU!!! Velocidade atual: " + c2.getVelocidade() + " Km/h.");
		Assert.assertEquals(c3.acelerar(20), carro3 + " --> ACELEROU!!! Velocidade atual: " + c3.getVelocidade() + " Km/h.");
	}
	
	
}
