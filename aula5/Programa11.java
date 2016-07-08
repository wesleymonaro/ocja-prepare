//0:49:20
package aula5;

import java.util.Scanner;

public class Programa11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qtdePositivo = 0;
		
		System.out.print("Digite a quantidade de elementos: ");
		int quantidade = entrada.nextInt();
		
		int lista[] = new int[quantidade];
		
		for (int n = 0; n < lista.length; n++) {
			System.out.println("Digite o elemento de índice[" + n + "]:");
			lista[n]=entrada.nextInt();
		}

		for(int elemento:lista){
			if (elemento>0)
				qtdePositivo++;
		}
		System.out.println("Quantodade de elementos positivos: " + qtdePositivo);
	}
}
