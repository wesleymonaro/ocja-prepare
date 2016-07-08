//1:40:00
package aula4;

import java.util.Scanner;

public class Programa13 {
	public static void determinaPositivo() {
		Scanner entrada = new Scanner(System.in);
		int numero=0;
		String resultado="";
		
		System.out.print("Digite um número: ");
		numero = entrada.nextInt();
		
		if(numero>0)
			resultado="Positvo";
		else if(numero<0)
			resultado="Negativo";
		else
			resultado="Zero";
		
		System.out.println("Resultado: " + resultado);
	}
	public static void main(String[] args) {
		determinaPositivo();
	}
}
