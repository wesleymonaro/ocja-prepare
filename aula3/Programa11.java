//1:56:00
package aula3;

import java.util.Scanner;

public class Programa11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número");
		int numero = entrada.nextInt();
		
		if(numero>0)
			switch (numero%2) {
			case 0:
				System.out.println("Par");
				break;
			case 1:
				System.out.println("Impar");
			}
		else
			System.out.println("Definição válida somente para positivos");
	}
}
