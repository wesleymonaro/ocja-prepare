package aula1;

import java.util.Scanner;

public class Decimo {
	public static void main(String[] args) {
	
				Scanner entrada=new Scanner(System.in);
				
				int numero1;
				int numero2;
				int soma;
				
				System.out.print("Digite o primeiro n�mero");
				numero1=entrada.nextInt();
				System.out.print("Digite o segundo n�mero");
				numero2=entrada.nextInt();
				
				if (numero1==numero2) 
				System.out.print("O primeiro n�mero � igual ao segundo");
				else 
				System.out.println("Os n�meros s�o diferentes");
					if (numero1>numero2)
					System.out.println("O nurero1 e maior que o numero2");
					
	}

}
