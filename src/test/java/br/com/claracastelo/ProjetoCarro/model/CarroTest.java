package br.com.claracastelo.ProjetoCarro.model;

import org.junit.Assert;
import org.junit.Test;

public class CarroTest {
	
	
	@Test
	public void testLigarMotor() {
		
		//Cenário
		String carro1 = "Gol";
		String carro2 = "Argo";
		String carro3 = "Astra";
				
		Carro c1 = new Carro("Volkswagen", carro1, 2008, false, 0);
		Carro c2 = new Carro("Fiat", carro2, 2023, true, 0);
		Carro c3 = new Carro("Chevrolet", carro3, 1995, true, 60);
		
		//Ação
		System.out.println(c1.situacaoMotor());
		System.out.println(c2.situacaoMotor());
		System.out.println(c3.situacaoMotor());
		
		//Verificação
		Assert.assertEquals("O motor do " + carro1 + " foi ligado agora.", c1.ligarMotor());
		Assert.assertEquals("O motor do " + carro2 + " já estava ligado.", c2.ligarMotor());
		Assert.assertEquals("O motor do " + carro2 + " já estava ligado.", c2.ligarMotor());
	}
	
	@Test
	public void testDesligarMotor() {
		
		//Cenário
		String carro1 = "Gol";
		String carro2 = "Argo";
		String carro3 = "Astra";
				
		Carro c1 = new Carro("Volkswagen", carro1, 2008, false, 0);
		Carro c2 = new Carro("Fiat", carro2, 2023, true, 0);
		Carro c3 = new Carro("Chevrolet", carro3, 1995, true, 60);
		
		//Ação
		System.out.println(c1.situacaoMotor());
		System.out.println(c2.situacaoMotor());
		System.out.println(c3.situacaoMotor());
		
		//Verificação
		Assert.assertEquals("O motor do " + carro1 + " já estava desligado.", c1.desligarMotor());
		Assert.assertEquals("O motor do " + carro2 + " foi desligado agora.", c2.desligarMotor());
		Assert.assertEquals("ATENÇÃO: O motor do " + carro3 + " não foi desligado pois o carro está em movimento.", c3.desligarMotor());
	}
	
	@Test
	public void testAcelerar() {
		
		//Cenário
		String carro1 = "Gol";
		String carro2 = "Argo";
		String carro3 = "Astra";
				
		Carro c1 = new Carro("Volkswagen", carro1, 2008, false, 0);
		Carro c2 = new Carro("Fiat", carro2, 2023, true, 0);
		Carro c3 = new Carro("Chevrolet", carro3, 1995, true, 60);
		
		//Ação
		System.out.println(c1.situacaoMotor());
		System.out.println(c2.situacaoMotor());
		System.out.println(c3.situacaoMotor());
		
		//Verificação
		Assert.assertEquals(c1.acelerar(20), carro1 + " --> ATENÇÃO: Não é possível acelerar com o motor desligado!");
		Assert.assertEquals(c2.acelerar(20), carro2 + " --> ACELEROU!!! Velocidade atual: " + c2.getVelocidade() + " Km/h.");
		Assert.assertEquals(c3.acelerar(20), carro3 + " --> ACELEROU!!! Velocidade atual: " + c3.getVelocidade() + " Km/h.");
	}
	
	@Test
	public void testFrear() {
		//Cenário
		String carro1 = "Gol";
		String carro2 = "Argo";
		String carro3 = "Astra";
		String carro4 = "Civic";
		
		Carro c1 = new Carro("Volkswagen", carro1, 2008, false, 0);
		Carro c2 = new Carro("Fiat", carro2, 2023, true, 0);
		Carro c3 = new Carro("Chevrolet", carro3, 1995, true, 60);
		Carro c4 = new Carro("Honda", carro4, 2023, true, 30);
		
		//Ação
		System.out.println(c1.situacaoMotor());
		System.out.println(c2.situacaoMotor());
		System.out.println(c3.situacaoMotor());
		System.out.println(c4.situacaoMotor());
		
		//Verificação
		Assert.assertEquals(c1.frear(40), carro1 + " --> ATENÇÃO: O motor está desligado! O carro já está parado!");
		Assert.assertEquals(c2.frear(40), carro2 + " --> ATENÇÃO: O carro já está parado!");
		Assert.assertEquals(c3.frear(40), carro3 + " --> FREOU!!! Velocidade atual: " + c3.getVelocidade() + " km/h.");
		Assert.assertEquals(c4.frear(40), carro4 + " --> FREOU!!! O carro está PARADO!");
		
	}
	
	
}
