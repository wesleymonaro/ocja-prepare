//Comparação
package aula2a;

import java.util.Scanner;

public class TerceiroB {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int numero;

		System.out.print("Digite o número: ");
		numero=entrada.nextInt();
		
		if(numero>0)
			System.out.println("Positivo");
		else if(numero==0)
			System.out.println("Zero");
		else if(numero<0)
			System.out.println("Negativo");	
	}
}
