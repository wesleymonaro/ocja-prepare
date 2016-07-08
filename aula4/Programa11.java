//1:28:00
package aula4;

import java.util.Scanner;

public class Programa11 {
	public static void calculaAreaCirculo() {
		Scanner entrada = new Scanner(System.in);
		double raio = 0;

		System.out.println("Digite o valor do raio: ");
		raio = entrada.nextDouble();

		System.out.println("Área do círculo: " + Math.PI * raio * raio);
	}

	public static void main(String[] args) {
		calculaAreaCirculo();
	}
}
