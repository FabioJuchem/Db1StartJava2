package br.com.db1.db1start.aula2;

public class ExercicioDouble {

	public double menorValor(double value1, double value2) {
		double menor;
		if (value1 < value2) {
			menor = value1;
		} else {
			menor = value2;
		}
		return menor;
	}

	public  Double menorDeTres(double value1, double value2, double value3) {

		if (value1 < value2 && value1 < value3) {
			return value1;
		} else if (value2 < value1 && value2 < value3) {
			return value2;
		} else {
			return value3;
		}
	}
	
	public Double mediaDeTresNumeros(Double num1,Double num2,Double num3) {
		Double media = (num1+num2+num3)/3;
		return media;
	}
	
	public Double areaDoTriangulo (Double base, Double altura) {
		return base * altura / 2;
	}

	

}
