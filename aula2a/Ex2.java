package aula2a;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		String operando;
		int num1;
		int num2;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro número");
		num1 = entrada.nextInt();

		System.out.println("Digite o segundo número");
		num2 = entrada.nextInt();

		System.out.println("Digite a operação");
		operando = entrada.next();

		switch (operando) {
		case "+":
			System.out.println("Adição");
			System.out.println(num1 + operando + num2 + " = " + (num1 + num2));
			break;
		case "-":
			System.out.println("Subtração");
			System.out.println(num1 + operando + num2 + " = " + (num1 - num2));
			break;
		case "*":
			System.out.println("Multiplicação");
			System.out.println(num1 + operando + num2 + " = " + (num1 * num2));
			break;
		case "/":
			if (num2 == 0) {
				System.out.println("Divisão por 0 não permitida");
			} else {
				System.out.println("Divisão");
				System.out.println(num1 + operando + num2 + " = "
						+ (num1 / num2));
			}
			break;
		default:
			System.out.println("Operação Inválida");
		}
	}
}
