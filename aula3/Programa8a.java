//1:19:10
package aula3;

import java.util.Scanner;

public class Programa8a {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String operacao = "";
		int operando1 = 0, operando2 = 0;
		
		//System.out.println("Wesley".equalsIgnoreCase("wEsLey"));//Método para comparar ignorando case sensitive
		
		System.out.println("Digite a operação:\nSoma"
				+ "\nSubtração"
				+ "\nMultiplicação"
				+ "\nDivisão\n");
		
		operacao = entrada.next().toLowerCase();//Método para transformar tudo em minusculo
		
		System.out.print("Digite o operando1: ");
		operando1 = entrada.nextInt();
		System.out.print("Digite o operando2: ");
		operando2 = entrada.nextInt();
		
		switch (operacao) {
		case "soma":
				System.out.println("Operação Soma");
				System.out.println("Resultado: " + (operando1 + operando2));
			break;
		case "subtração":
			System.out.println("Operação Subtração");
			System.out.println("Resultado: " + (operando1 - operando2));
		break;
		case "multiplicação":
			System.out.println("Operação Multiplicação");
			System.out.println("Resultado: " + (operando1 * operando2));
		break;
		case "divisão":
			System.out.println("Operação Divisão");
			if (operando2 == 0)
				System.out.println("Divisão por 0 não permitida");
			else
				System.out.println("Resultado: " + (operando1 / operando2));
		break;

		default:
			System.out.println("Operação inválida");
			break;
		}
		
		
	}
}
