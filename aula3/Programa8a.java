//1:19:10
package aula3;

import java.util.Scanner;

public class Programa8a {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String operacao = "";
		int operando1 = 0, operando2 = 0;
		
		//System.out.println("Wesley".equalsIgnoreCase("wEsLey"));//M�todo para comparar ignorando case sensitive
		
		System.out.println("Digite a opera��o:\nSoma"
				+ "\nSubtra��o"
				+ "\nMultiplica��o"
				+ "\nDivis�o\n");
		
		operacao = entrada.next().toLowerCase();//M�todo para transformar tudo em minusculo
		
		System.out.print("Digite o operando1: ");
		operando1 = entrada.nextInt();
		System.out.print("Digite o operando2: ");
		operando2 = entrada.nextInt();
		
		switch (operacao) {
		case "soma":
				System.out.println("Opera��o Soma");
				System.out.println("Resultado: " + (operando1 + operando2));
			break;
		case "subtra��o":
			System.out.println("Opera��o Subtra��o");
			System.out.println("Resultado: " + (operando1 - operando2));
		break;
		case "multiplica��o":
			System.out.println("Opera��o Multiplica��o");
			System.out.println("Resultado: " + (operando1 * operando2));
		break;
		case "divis�o":
			System.out.println("Opera��o Divis�o");
			if (operando2 == 0)
				System.out.println("Divis�o por 0 n�o permitida");
			else
				System.out.println("Resultado: " + (operando1 / operando2));
		break;

		default:
			System.out.println("Opera��o inv�lida");
			break;
		}
		
		
	}
}
