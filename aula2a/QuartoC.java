package aula2a;

import java.util.Scanner;

public class QuartoC {
	public static void main(String[] args){
		Scanner entrada=new Scanner(System.in);
		int numero;

		System.out.print("Digite o n�mero: ");
		numero=entrada.nextInt();

		if(numero>=0)
			if(numero%2==0)
				System.out.println("Par");
			else 
				System.out.println("�mpar");
		else
			System.out.println("Negativo");
		
		System.out.println((numero>=0)?((numero%2==0)?"Par":"�mpar"):"Negativo");
	}
}
