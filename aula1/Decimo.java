package aula1;

import java.util.Scanner;

public class Decimo {
	public static void main(String[] args) {
	
				Scanner entrada=new Scanner(System.in);
				
				int numero1;
				int numero2;
				int soma;
				
				System.out.print("Digite o primeiro número");
				numero1=entrada.nextInt();
				System.out.print("Digite o segundo número");
				numero2=entrada.nextInt();
				
				if (numero1==numero2) 
				System.out.print("O primeiro número é igual ao segundo");
				else 
				System.out.println("Os números são diferentes");
					if (numero1>numero2)
					System.out.println("O nurero1 e maior que o numero2");
					
	}

}
