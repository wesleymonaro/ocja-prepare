//2:42:30
package aula4;

public class Programa19 {
	public static void determinaPositivo(int numero) {
		String resultado = "";

		if (numero > 0)
			resultado = "Positivo";
		else if (numero < 0)
			resultado = "Negativo";
		else
			resultado = "Zero";

		System.out.println("Resultado: " + resultado);
	}

	public static void main(String[] args) {
		determinaPositivo(0);
		determinaPositivo(10);
		determinaPositivo(-10);
	}
}
