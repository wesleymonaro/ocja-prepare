//3:36:45
package aula4;

import java.util.Scanner;

public class Programa29 {
	public static boolean verificarPositivo(int numero) {

		if(numero>0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número: ");
		int num = entrada.nextInt();
		
		boolean resultado = verificarPositivo(num);
		
		if(resultado==true)
			System.out.println("Positivo");
		else
			System.out.println("Negativo");
	}
	
}
