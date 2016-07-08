package aula2a;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num1, num2;

		System.out.print("Digite o primeiro número: ");
		num1=entrada.nextInt();

		System.out.print("Digite o segundo número: ");
		num2=entrada.nextInt();

		if(num1>0)
			if(num1==num2)
				System.out.println("Número1 positivo e iguais");
			else
				System.out.println("Número positivo e diferentes");		
		else
			System.out.println("Negativo");
		
		System.out.println((num1>0)?((num1==num2)?"N1 pos e igual":"N1 pos e dif"):"Neg");

	}
}