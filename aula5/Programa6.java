//1:08:20
package aula5;

import java.util.Scanner;

public class Programa6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de elementos: ");
		int n = entrada.nextInt();
		
		
		String array[] = new String[n];
		array = new String[n];
		System.out.printf("%s%8s\n", "Índice", "Valor");
		
		for (int contador = 0; contador < array.length; contador++)
			System.out.printf("%5d%8d\n", contador, array[contador]);
	}
}
