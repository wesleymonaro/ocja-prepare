//1:48:25
//Par ou �mpar com switch case
package aula3;

import java.util.Scanner;

public class Programa9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int numero = entrada.nextInt();
		
		switch (numero%2) {
		case 0:
			System.out.println("Par");
			break;
		case 1:
			System.out.println("�mpar");
		default:
			System.out.println("Resto -1");
		}
	}
}
