package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class ExercicioIntegerTeste {
	@Test
	public void deveRetornarSomaDeDoisNumeros(){
		ExercicioInteger exercicios = new ExercicioInteger();
		Integer resultado = exercicios.somar(10, 10);
		Assert.assertEquals(20, resultado,0);
	}
	@Test
	public void deveRetornarSubtracaoDeDoisNumeros(){
		ExercicioInteger exercicios = new ExercicioInteger();
		Integer resultado = exercicios.sub(100, 50);
		Assert.assertEquals(50, resultado,0);
	}
	@Test
	public void deveRetornarMultiplicacaoDeDoisNumeros(){
		ExercicioInteger exercicios = new ExercicioInteger();
		Integer resultado = exercicios.mult(2, 5);
		Assert.assertEquals(10, resultado,0);
	}
	@Test
	public void deveRetornarDivisaoDeDoisNumeros(){
		ExercicioInteger exercicios = new ExercicioInteger();
		Integer resultado = exercicios.div(10, 5);
		Assert.assertEquals(2, resultado,0);
	}
	@Test
	public void deveRetornarSeNumeroEPar(){
		ExercicioInteger exercicios = new ExercicioInteger();
		boolean resultado = exercicios.par(10);
		Assert.assertEquals(true,resultado);
	}
	@Test
	public void deveRetornarSeNumeroEImpar(){
		ExercicioInteger exercicios = new ExercicioInteger();
		boolean resultado = exercicios.par(11);
		Assert.assertEquals(false,resultado);
	}
	@Test
	public void deveRetornarNumeroMaior(){
		ExercicioInteger exercicios = new ExercicioInteger();
		Integer resultado = exercicios.maior(10, 5);
		Assert.assertEquals(10, resultado,0);
	}
	@Test
	public void deveRetornarQuantidadeDeImpares(){
		ExercicioInteger exercicios = new ExercicioInteger();
		Integer resultado = exercicios.numeroDeImpares(90);
		Assert.assertEquals(5, resultado,0);
	}
	
	

}
