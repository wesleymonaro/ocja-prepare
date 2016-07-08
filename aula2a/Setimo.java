//Comprimento da circunferência
package aula2a;

import java.util.Scanner;

public class Setimo {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double raio, comprimento;
		
		System.out.print("Digite o raio: ");		
		raio=entrada.nextDouble();
		
		comprimento=2*Math.PI*raio;
		
		System.out.println("Valor do comprimento da circunferência: " + comprimento);
		
		
	}
}
