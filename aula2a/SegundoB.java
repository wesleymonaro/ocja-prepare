package aula2a;

import java.util.Scanner;

public class SegundoB {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Digite o primeiro número: ");
		num1=entrada.nextInt();
		
		System.out.print("Digite o segundo número: ");
		num2=entrada.nextInt();
		
		String resultado=(num1==num2)?"Iguais":"Diferentes";
		System.out.println(resultado);
		
		System.out.println((num1==num2)?"Iguais":"Diferentes");
	}

}
