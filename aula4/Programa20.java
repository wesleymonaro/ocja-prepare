//2:46:00
package aula4;

public class Programa20 {
	public static void determinaPositivo(int numero) {
		String resultado="";
		
		switch (numero%2) {
		case 0:
			resultado = "Par";
			break;
		case 1:
			resultado = "Ímpar";

		}
		System.out.println("Resultado: " + resultado);
	}
	public static void main(String[] args) {
		determinaPositivo(5);
		determinaPositivo(10);
		
	}
}
