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

		System.out.println("Digite o primeiro n�mero");
		num1 = entrada.nextInt();

		System.out.println("Digite o segundo n�mero");
		num2 = entrada.nextInt();

		System.out.println("Digite a opera��o");
		leitura = entrada.next();
		operacao = leitura.charAt(0);//0 porque � a primeira letra da String leitura

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
				System.out.println("Divis�o por 0 n�o permitida");
			} else {
				System.out.println(num1 + operacao + num2 + " = "
						+ (num1 / num2));
			}
			break;
		default:
			System.out.println("Opera��o Inv�lida");
		}
	}
}
