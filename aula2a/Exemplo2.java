package aula2a;

import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num1, num2;

		System.out.print("Digite o primeiro n�mero: ");
		num1=entrada.nextInt();

		System.out.print("Digite o segundo n�mero: ");
		num2=entrada.nextInt();

		if(num1>0)
			if(num1==num2)
				System.out.println("N�mero1 positivo e iguais");
			else
				System.out.println("N�mero positivo e diferentes");		
		else
			System.out.println("Negativo");
		
		System.out.println((num1>0)?((num1==num2)?"N1 pos e igual":"N1 pos e dif"):"Neg");

	}
}