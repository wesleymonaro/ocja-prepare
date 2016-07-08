//3:37:00
package aula2;

import java.util.Scanner;

public class OnzeA {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int grau;
		
		System.out.print("Digite o grau do círculo: ");
		grau = entrada.nextInt();
		
		//com &&
		if(grau>0 && grau<90)
			System.out.println("Quadrante 1");
		else if (grau >90 && grau < 180)
			System.out.println("Quadrante 2");
		else if (grau > 180 && grau < 270)
			System.out.println("Quadrante 3");
		else
			System.out.println("Quadrante 4");
		
		//Decrescente
		if (grau >270)
			System.out.println("Quadrante 4");
		else if (grau > 180)
			System.out.println("Quadrante 3");
		else if (grau > 90)
			System.out.println("Quadrante 2");
		else
			System.out.println("Quadrante 1");
		
		
	}
}
