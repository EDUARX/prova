package depurador;

public class Factorial {

	public static double factorial(double numero) {

		if (numero == 0)
			return 1;
		else {
			double resultat = numero * factorial(numero - 1);
			return resultat;
		}
	}

	public static void main(String[] args) {

		System.out.println(factorial(19)); // a partir de 10000 dóna java.lang.StackOverflowError

	}

}