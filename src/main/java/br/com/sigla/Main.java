package br.com.sigla;

public class Main {

	public static void main(String[] args) {
		
        somar(2, 3);
	}
	
	public static void somar(int number1, int number2) {
		double result = number1 + number2;
		
		System.out.println(result);
	}

	public static void subtrair(int number1, int number2) {
		double result = number1 - number2;
		
		System.out.println(result);
	}
}
