package br.com.db1.db1start.aula2;

import org.junit.Assert;
import org.junit.Test;

public class ExercicioDoubleTeste {
	
	@Test
	public void deveRetonarMenorValor() {
		ExercicioDouble exercicio = new ExercicioDouble();
		Double resultado = exercicio.menorValor(10.0, 20.0);
		Assert.assertEquals(10.0, resultado,0);
	}
	@Test
	public void deveRetonarMenorValorDeTres() {
		ExercicioDouble exercicio = new ExercicioDouble();
		Double resultado = exercicio.menorDeTres(10.0, 20.0,30.0);
		Assert.assertEquals(10.0, resultado,0);
	}
	@Test
	public void deveRetonarMediaDeTresNumeros() {
		ExercicioDouble exercicio = new ExercicioDouble();
		Double resultado = exercicio.mediaDeTresNumeros(20.0, 30.0, 40.0);
		Assert.assertEquals(30.0, resultado,0);
	}
	@Test
	public void deveRetonarAreaDoTriangulo() {
		ExercicioDouble exercicio = new ExercicioDouble();
		Double resultado = exercicio.areaDoTriangulo(2.0, 3.0);
		Assert.assertEquals(3.0, resultado,0);
	}

}
