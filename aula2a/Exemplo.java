package aula2a;

import java.util.Scanner;

public class Exemplo {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num1, num2;

		System.out.print("Digite o primeiro número: ");
		num1=entrada.nextInt();

		System.out.print("Digite o segundo número: ");
		num2=entrada.nextInt();
		
		System.out.println((num1==num2)?"São iguais":"São diferentes");

	}
}
