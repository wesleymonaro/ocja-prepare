package aula2;

import java.util.Scanner;

public class SegundoA {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite o primeiro n�mero");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		num2 = entrada.nextInt();
		
		if(num1==num2)
			System.out.println("N�meros iguais");
		else
			System.out.println("N�meros diferentes");
	}
}
