package br.com.db1.db1start.aula2;

public class ExercicioString {
	
	public  String upper (String nome1){
		String nome = nome1.toUpperCase();
		return nome;
	}
	public  String lower (String nome2){
		String nome = nome2.toLowerCase();
		return nome;
	}
	public Integer quantidadeDeLetras1 (String nome){
		Integer quantidade;
		quantidade = nome.length();
		return quantidade;
	}
	public Integer quantidadeDeLetras2 (String nome){
		Integer quantidade;
		quantidade = nome.length();
		return quantidade;
	}
	
	public Integer quantidadeDeLetras3 (String nome){
		return nome.trim().length();
		
	}
	public String quatroPrimeirasLetras (String nome){
		return (String) nome.subSequence(0, 4);
	}
	
	public String aPartirDaTerceiraLetra (String nome) {
		return (String) nome.subSequence(3, 12);
	}
	public String apenasAsQuatroUltimasLetras (String nome) {
		return (String) nome.subSequence(8, 12);
	}
	public String substituirNomePorAluno (String nome) {
		return (String) nome.replace("Fabio", "Aluno");
	}
	public String separarNomes(String nome) {
		String frutas[] = nome.split(",");
		return frutas[0]+" " +frutas[1]+ " " + frutas[2];
	}
	public Integer quantasVogaistemNoTexto(String text) {
		Integer vogais = 0;
		text.toLowerCase();
		for (int i = 0;i < text.length();i++) {
			char letra = text.charAt(i);
			if( letra == 'a'|| letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
				vogais++;
			}
		}
		return vogais;
				
	}
	public String textoInvertido(String texto) {
		texto = new StringBuilder(texto).reverse().toString();
		return texto;
	}
	
	

}
