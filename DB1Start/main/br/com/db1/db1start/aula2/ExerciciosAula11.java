package br.com.db1.db1start.aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class ExerciciosAula11Teste {

	@Test
	public void deveRetornarListaDeNomes() {

		ExerciciosAula11 aula11 = new ExerciciosAula11();
		List<String> coresPref = new ArrayList<>();
		coresPref.add("Azul");
		coresPref.add("Amarelo");
		coresPref.add("Branco");

		List<String> cores = aula11.cores(coresPref);

		Assert.assertEquals("Azul", cores.get(0));
		Assert.assertEquals("Amarelo", cores.get(1));
		Assert.assertEquals("Branco", cores.get(2));

	}

	@Test
	public void deveRetornarQuantidadeDeItens() {

		ExerciciosAula11 aula11 = new ExerciciosAula11();

		List<String> itens = new ArrayList<>();
		itens.add("Paçoca");
		itens.add("Pamonha");
		itens.add("Pipoca");
		itens.add("Pastel");
		
		Integer quant = aula11.quantidadeDeItens(itens);
		
		Assert.assertEquals(4, quant, 0);

	}

	@Test
	public void deveRetornarStringsEmUmaLista() {

		ExerciciosAula11 aula11 = new ExerciciosAula11();
		List<String> itens = new ArrayList<>();

		itens = aula11.coresQueMaisGostoRemovendoSegunda("Azul", "Amarelo");

		Assert.assertEquals("Azul", itens.get(0));
		

	}

	@Test
	public void deveRetornarExercicio1Ordenado() {

		ExerciciosAula11 aula11 = new ExerciciosAula11();
		List<String> itens = new ArrayList<>();
		itens.add("Amarelo");
		itens.add("Azul");
		itens.add("Branco");

		itens = aula11.coresDoExercicio1Ordenados(itens);

	

		Assert.assertEquals("Amarelo", itens.get(0));
		Assert.assertEquals("Azul", itens.get(1));
		Assert.assertEquals("Branco", itens.get(2));

	}

	
	@Test
	public void deveRetornarListaDeFormaDecrescente() {

		ExerciciosAula11 aula11 = new ExerciciosAula11();
		List<String> lista = new ArrayList<>();

		lista.add("Matrix");
		lista.add("Neo");
		lista.add("Trinity");

		List<String> itens = aula11.listaOrdenadadeFormaDescrescente(lista);

		Assert.assertEquals("Trinity", itens.get(0));
		Assert.assertEquals("Neo", itens.get(1));
		Assert.assertEquals("Matrix", itens.get(2));

	}

	@Test
	public void deveRetornarListaDeListaDeParesEImpares() {
		ExerciciosAula11 aula11 = new ExerciciosAula11();
		
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		
		List<List<Integer>> retorno = aula11.listasDeParesEImpares(numeros);
		
		Assert.assertEquals(4, numeros.size());
		
		List<Integer> pares = retorno.get(0);
		List<Integer> impares = retorno.get(1);
		
		Assert.assertEquals(2, pares.size());
		Assert.assertEquals(2, impares.size());
		
		Assert.assertEquals(2, pares.get(0), 0);
		Assert.assertEquals(4, pares.get(1), 0);
		
		Assert.assertEquals(1, impares.get(0), 0);
		Assert.assertEquals(3, impares.get(1), 0);
		
		
		
	}

	@Test
	public void deveRetornarSoma() {

		ExerciciosAula11 aula11 = new ExerciciosAula11();
		List<Integer> lista = new ArrayList<>();
		lista.add(10);
		lista.add(20);

		Integer itens = aula11.ListaIntegerRetornarSoma(lista);

		Assert.assertEquals(30, itens, 0);

	}

	@Test
	public void deveRetornarMedia() {

		ExerciciosAula11 aula11 = new ExerciciosAula11();
		List<Double> lista = new ArrayList<>();
		lista.add(10.0);
		lista.add(20.0);
		lista.add(30.0);

		Double itens = aula11.ListaIntegerRetornarMediaDeDouble(lista);

		Assert.assertEquals(20.0, itens, 0);

	}

	@Test
	public void deveRetornarMenorValor() {

		ExerciciosAula11 aula11 = new ExerciciosAula11();
		List<Integer> lista = new ArrayList<>();
		lista.add(10);
		lista.add(20);

		Integer itens = aula11.ListaIntegerRetornarMenorValor(lista);

		Assert.assertEquals(10, itens, 0);

	}

	@Test
	public void deveRetornarMaiorValor() {

		ExerciciosAula11 aula11 = new ExerciciosAula11();
		List<Integer> lista = new ArrayList<>();
		lista.add(10);
		lista.add(20);

		Integer itens = aula11.ListaIntegerRetornarMaiorValor(lista);

		Assert.assertEquals(20, itens, 0);

	}

	@Test
	public void deveRetirarNumerosImpares() {

		ExerciciosAula11 aula11 = new ExerciciosAula11();
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);

		List<Integer> itens = aula11.ListaIntegerRetirarImpares(lista);

		Assert.assertEquals(2, itens.get(0), 0);
		Assert.assertEquals(4, itens.get(1), 0);

	}

	@Test
	public void deveRetornarTodasAsVogais() {
		String frase = "esta e uma frase";

		ExerciciosAula11 aula11 = new ExerciciosAula11();

		List<Character> itens = aula11.retornarTodasVogais(frase);

		Assert.assertEquals('e', itens.get(0), 0);
		Assert.assertEquals('a', itens.get(1), 0);
		Assert.assertEquals('e', itens.get(2), 0);
		Assert.assertEquals('u', itens.get(3), 0);
		Assert.assertEquals('a', itens.get(4), 0);
		Assert.assertEquals('a', itens.get(5), 0);
		Assert.assertEquals('e', itens.get(6), 0);

	}
	@Test
	public void deveRetornarListaSeparadaMap() {
		ExerciciosAula11 aula11 = new ExerciciosAula11();
		List<String> palavras = new ArrayList<>();
		
		palavras.add("Maiko");
		palavras.add("Ana");

		
		Map<String, List<String>> retorno = aula11.dividirPalavrasMap(palavras); 
		
		Assert.assertEquals(2, retorno.size());
		Assert.assertEquals("Ana", retorno.get("A").get(0));
		Assert.assertEquals("Maiko", retorno.get("M").get(0));
	}

}
