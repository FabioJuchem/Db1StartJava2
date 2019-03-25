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

	public  double menorDeTres(double value1, double value2, double value3) {

		if (value1 < value2 && value1 < value3) {
			return value1;
		} else if (value2 < value1 && value2 < value3) {
			return value2;
		} else {
			return value3;
		}
	}
	
	public double mediaDeTresNumeros(double num1,double num2,double num3) {
		double media = (num1+num2+num3)/3;
		return media;
	}
	
	public double areaDoTriangulo (double base, double altura) {
		return base * altura / 2;
	}

	

}
