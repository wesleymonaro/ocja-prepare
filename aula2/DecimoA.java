//3:20:00
package aula2;

import java.util.Scanner;

public class DecimoA {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a média: ");
		double media = entrada.nextDouble();

		if (media <5)
			System.out.println("Reprovado");
		else if (media<7)
			System.out.println("Exame");
		else
			System.out.println("Aprovado");
		
		//$$ Operador de curto circuito
	}
}
