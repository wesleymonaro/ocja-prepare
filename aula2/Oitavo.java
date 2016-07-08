package aula2;

import java.util.Scanner;

public class Oitavo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double raio, area;
		
		System.out.println("Digite o raio");
		raio=entrada.nextDouble();
				
		//area = Math.PI*raio*raio;
		area = Math.PI*Math.pow(raio, 2);
		
		System.out.println("Valor da área do círculo: " + area);
		System.out.printf("%s%.2f", "Valor da area do círculo: ", area);
	}
}
