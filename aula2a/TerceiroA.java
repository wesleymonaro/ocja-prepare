//Comparação
package aula2a;

import java.util.Scanner;

public class TerceiroA {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int numero;

		System.out.print("Digite o número: ");
		numero=entrada.nextInt();
		
		if(numero>0)
			System.out.println("Positivo");
		else
			System.out.println("Negativo ou zero");
		
		System.out.println((numero>0)?"Positivo":"Negativo ou Zero");
	}
}
