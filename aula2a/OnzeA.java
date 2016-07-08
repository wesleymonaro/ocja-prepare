package aula2a;

import java.util.Scanner;

public class OnzeA {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int angulo;
		
		System.out.print("Digite o ângulo: ");
		angulo=entrada.nextInt();
		
		if(angulo>270)
			System.out.println("Quarto quadrante");
		else if(angulo>180)
			System.out.println("Terceiro quadrante");
		else if(angulo>90)
			System.out.println("Segundo quadrante");
		else
			System.out.println("Primeiro quadrante");
	}
}
