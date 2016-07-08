package aula2;

import java.util.Scanner;

public class QuartoA {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;

		System.out.println("Digite o número: ");
		numero = entrada.nextInt();
		
		if(numero>0)
		if(numero%2==0)
			System.out.println("Par");
		else if (numero%2 != 0)
			System.out.println("Ímpar");
		else
			System.out.println("Precisa ser positivo");
		
		System.out.println((numero>0)?(numero%2==0)?"Par":"Impar":"Precisa ser positivo");
	
	}
}
