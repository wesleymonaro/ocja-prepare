//Voltando aos ifs
package aula2a;

import java.util.Scanner;

public class DecimoA {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Digite a média: ");
		double media=entrada.nextDouble();
		
		if(media>=7)
			System.out.println("Aprovado");
		else if(media>=5)
			System.out.println("Exame");
		else
			System.out.println("Reprovado");
	}
}
