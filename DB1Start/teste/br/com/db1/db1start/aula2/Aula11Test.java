package br.com.db1.db1start.aula2;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Aula11Test {

	@Test
	public void deveRetornarListaDeNomes(){
		
		Aula11 aula11 = new Aula11();
		
		List<String> nomes = aula11.nomes();
		
		Assert.assertEquals("Maiko", nomes.get(0));
		Assert.assertEquals("Joao", nomes.get(1));
		
	}
}
