package simulado;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o número que deseja o fatorial: ");
		int numero = entrada.nextInt();
		int resultado = 1;
		
		for (int i = 1; i <= numero; i++) 
			resultado = resultado * i;
		
		System.out.println("O fatorial de "+ numero +" é: " + resultado);
	}
}
