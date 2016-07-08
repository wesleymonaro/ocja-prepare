package aula2a;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		String operando;
		int num1;
		int num2;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero");
		num1 = entrada.nextInt();

		System.out.println("Digite o segundo n�mero");
		num2 = entrada.nextInt();

		System.out.println("Digite a opera��o");
		operando = entrada.next();

		switch (operando) {
		case "+":
			System.out.println("Adi��o");
			System.out.println(num1 + operando + num2 + " = " + (num1 + num2));
			break;
		case "-":
			System.out.println("Subtra��o");
			System.out.println(num1 + operando + num2 + " = " + (num1 - num2));
			break;
		case "*":
			System.out.println("Multiplica��o");
			System.out.println(num1 + operando + num2 + " = " + (num1 * num2));
			break;
		case "/":
			if (num2 == 0) {
				System.out.println("Divis�o por 0 n�o permitida");
			} else {
				System.out.println("Divis�o");
				System.out.println(num1 + operando + num2 + " = "
						+ (num1 / num2));
			}
			break;
		default:
			System.out.println("Opera��o Inv�lida");
		}
	}
}
