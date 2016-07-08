//0:57:40
//exercicio 2 da aula2
package aula3;

import java.util.Scanner;

public class Programa8 {
	public static void main(String[] args) {
		char operacao;
		int num1,num2;
		String leitura;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro número");
		num1 = entrada.nextInt();

		System.out.println("Digite o segundo número");
		num2 = entrada.nextInt();

		System.out.println("Digite a operação");
		leitura = entrada.next();
		operacao = leitura.charAt(0);//0 porque é a primeira letra da String leitura

		switch (operacao) {
		case '+':
			System.out.println(num1 + operacao + num2 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + operacao + num2 + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + operacao + num2 + " = " + (num1 * num2));
			break;
		case '/':
			if (num2 == 0) {
				System.out.println("Divisão por 0 não permitida");
			} else {
				System.out.println(num1 + operacao + num2 + " = "
						+ (num1 / num2));
			}
			break;
		default:
			System.out.println("Operação Inválida");
		}
	}
}
