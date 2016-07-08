//1:47:25
package aula4;

import java.util.Scanner;

public class Programa14 {
	public static void verificaParImpar(){
		Scanner entrada = new Scanner(System.in);
		int numero=0;
		String resultado = "";
		
		System.out.println("Digite o número: ");
		numero=entrada.nextInt();
		
		if(numero%2==0)
			resultado="Par";
		else
			resultado="Ímpar";
			
		System.out.println("Resultado: " + resultado);
	}
	public static void main(String[] args) {
		verificaParImpar();
	}
}
