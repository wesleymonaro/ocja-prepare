//1:58:30
package aula4;

import java.util.Scanner;

public class Programa16 {
	public static void calculaFatorial(){
		Scanner entrada = new Scanner(System.in);
		int fatorial=1;
		
		System.out.println("Digite o número cujo fatorial se deseja calcular: ");
		int n = entrada.nextInt();
		
		for(int contador=1; contador <=n; contador ++)
			fatorial=fatorial*contador;
			
		System.out.println("Fatoral de " + n + " vale " + fatorial);
		
	}
	public static void main(String[] args) {
		calculaFatorial();
	}
}
