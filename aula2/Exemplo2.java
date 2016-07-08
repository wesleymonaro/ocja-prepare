package aula2;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2;

		System.out.println("Digite o primeiro número");
		num1 = entrada.nextInt();

		System.out.println("Digite o segundo número");
		num2 = entrada.nextInt();

		/*if (num1 > 0)
			if (num1 == num2)
				System.out.println("Número 1 Positivo e iguais");
			else
				System.out.println("Número 1 Positivo e diferentes");
		else
			System.out.println("Negativo");*/
		
		System.out.println((num1>0)?((num1==num2)?"N1 Positivo e iguais":"N1 Positivo e diferentes"):"Negativo");

	}
}
