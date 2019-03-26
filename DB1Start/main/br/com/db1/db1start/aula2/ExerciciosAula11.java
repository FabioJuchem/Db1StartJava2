package br.com.db1.db1start.aula2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExerciciosAula11 {

	public List<String> cores(List<String> cores) {

		return cores;
	}

	public Integer quantidadeDeItens(List<String> itens) {

		return itens.size();

	}

	public List<String> coresQueMaisGostoRemovendoSegunda(String cor1, String cor2) {
		List<String> cores = new ArrayList<>();
		cores.add(cor1);
		cores.add(cor2);
		cores.remove(1);
		return cores;
	}

	public List<String> coresDoExercicio1Ordenados(List<String> itens) {

		Collections.sort(itens);
		return itens;

	}

	public List<String> listaOrdenadadeFormaDescrescente(List<String> lista) {

		Collections.reverse(lista);
		return lista;
	}

	public List<List<Integer>> listasDeParesEImpares(List<Integer> numeros) {
		List<Integer> par = new ArrayList<>();
		List<Integer> impar = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();

		for (int i = 0; i < numeros.size(); i++) {
			Integer aux = numeros.get(i);
			if (aux % 2 == 0) {
				par.add(aux);

			} else {
				impar.add(aux);
			}
		}
		list.add(0, par);
		list.add(1, impar);
		return list;

	}

	public Map<String, List<String>> dividirPalavrasMap(List<String> nomes) {
		Map<String, List<String>> retorno = new HashMap<>();
		Collections.sort(nomes);

		for (String value : nomes) {
			String letra = value.substring(0, 1);

			if (!retorno.containsKey(letra)) {
				retorno.put(letra, new ArrayList<String>());
			}
			retorno.get(letra).add(value);
		}
		return retorno;
	}

	public Integer ListaIntegerRetornarSoma(List<Integer> lista) {
		
		return lista.get(0) + lista.get(1);
	}

	public Double ListaIntegerRetornarMediaDeDouble(List<Double> lista) {
		
		Double media = (lista.get(0) + lista.get(1) + lista.get(2)) / 3;
		return media;
	}

	public Integer ListaIntegerRetornarMenorValor(List<Integer> lista) {
		
		if (lista.get(0) < lista.get(1)) {
			return lista.get(0);
		} else {
			return lista.get(1);
		}

	}

	public Integer ListaIntegerRetornarMaiorValor(List<Integer> lista) {
		
		if (lista.get(0) > lista.get(1)) {
			return lista.get(0);
		} else {
			return lista.get(1);
		}

	}

	public List<Integer> ListaIntegerRetirarImpares(List<Integer> lista) {
		
		for (int i = 0; i < lista.size(); i++)
			if (lista.get(i) % 2 != 0) {
				lista.remove(i);
			}
		return lista;

	}

	public List<Character> retornarTodasVogais(String frase) {

		List<Character> vogais = new ArrayList<>();
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				vogais.add(letra);
			}
		}
		return vogais;
	}

}
