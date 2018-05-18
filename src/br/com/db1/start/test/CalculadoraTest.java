package br.com.db1.start.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.classes.Calculadora;

public class CalculadoraTest {

	private Calculadora calculadora = new Calculadora();
	
	@After
	public void finaliza(){
		System.out.println("Executou com sucesso!");
	}

	@Before
	public void init() {

		calculadora.setValor1(1d);
		Assert.assertTrue(1 == calculadora.getValor1());

		calculadora.setValor2(23d);
		Assert.assertTrue(23 == calculadora.getValor2());

	}

	@Test
	public void somarTest() {

		Assert.assertTrue(24 == calculadora.somar());

	}

	@Test
	public void subtrairTest() {

		Assert.assertTrue(22 == calculadora.subtrair());

	}

	@Test
	public void multiplicarTest() {

		Assert.assertTrue(23 == calculadora.multiplicar());

	}

	@Test
	public void dividirTest() {

		Assert.assertTrue(23 == calculadora.dividir());

	}
	@Test
	public void zerarTest(){
		calculadora.zerar();
		Assert.assertTrue(0 == calculadora.getValor1());
		Assert.assertTrue(0 == calculadora.getValor2());
	}
}
