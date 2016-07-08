//1:52:00
package aula4;

import java.util.Scanner;

public class Programa15 {
	/**
	 * 
	 */
	public static void verificaParImpar(){
		Scanner entrada = new Scanner(System.in);int numero=0;
		String resultado="";
		
		System.out.println("Digite o número: ");
		numero = entrada.nextInt();
		
		switch (numero%2) {
		case 0:
			resultado="Par";
			break;
		case 1:
			resultado="Ímpar";

			System.out.println("Resultado: " + resultado);
		}
	}
	public static void main(String[] args) {
		verificaParImpar();
	}
}
