package br.com.db1.db1start.aula2;

public class ExercicioDouble {

	public static double menorValor(double value1, double value2) {
		double menor;
		if (value1 < value2) {
			menor = value1;
		} else {
			menor = value2;
		}
		return menor;
	}

	public static Double menor(double value1, double value2, double value3) {

		if (value1 < value2 && value1 < value3) {
			return value1;
		} else if (value2 < value1 && value2 < value3) {
			return value2;
		} else {
			return value3;
		}
	}

	public static void main(String[] args) {
		ExercicioString result = new ExercicioString();
		System.out.println(result.quantidadeDeLetras3(" fabioeu "));
	}

}
