//2:06:30
package aula5;

import java.util.Scanner;

public class Programa10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de elementos: ");
		int quantidade = entrada.nextInt();
		
		int lista[] = new int[quantidade];
		
		for (int n = 0; n < lista.length; n++) {
			System.out.print("Digite o elemento de índice[" + n + "]:");
			lista[n]=entrada.nextInt();
		}
		for (int elemento:lista) {
			System.out.print(elemento + " ");
		}
	}
}
