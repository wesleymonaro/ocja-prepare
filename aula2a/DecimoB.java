package aula2a;

import java.util.Scanner;

public class DecimoB {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double media;
		
		System.out.print("Digite a média: ");
		media=entrada.nextDouble();
		
		if(media<=3)
			System.out.println("Reprovado");
		else if(media<=6)
			System.out.println("Exame");
		else
			System.out.println("Aprovado");		
	}
}
