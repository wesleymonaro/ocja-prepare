package aula2;

import java.util.Scanner;

public class TerceiroA {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o número: ");
		numero = entrada.nextInt();
		
		if(numero>0)
			System.out.println("Positivo");
		else
			System.out.println("Negativo ou Zero");
		
		System.out.println((numero>0)?"Positivo":"Negativo ou Zero");
	}
}
