package aula2;

import java.util.Scanner;

public class Exemplo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2;

		System.out.println("Digite o primeiro n�mero");
		num1 = entrada.nextInt();

		System.out.println("Digite o segundo n�mero");
		num2 = entrada.nextInt();
		
		String resultado="";
		
		/*//if simplificado
		resultado=(num1==num2)?"iguais":"diferentes";
		
		System.out.println(resultado);*/
		
		System.out.println((num1==num2)?"S�o Iguais":"S�o Diferentes");
	}
}
