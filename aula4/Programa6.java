//0:41:40
package aula4;

import java.util.Scanner;

public class Programa6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número cujo fatorial deseja calcular: ");
		int n = entrada.nextInt();

		int contador = n, fatorial = 1;
		do {
			fatorial = fatorial * contador;
			// System.out.println(fatorial);
			contador -= 1;
		} while (contador >= 1);
		
		System.out.println(fatorial);
	}
}
