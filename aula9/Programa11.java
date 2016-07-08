package aula9;

import java.util.InputMismatchException;


public class Programa11 {
	static void receber(){
		java.util.Scanner entrada = new java.util.Scanner(System.in);
		
		System.out.print("Entre com um inteiro: ");
		try {
			int n1 = entrada.nextInt();
		} catch (InputMismatchException i) {
			System.out.println("Digite um inteiro!!!");
			receber();
		}
	}
	public static void main(String[] args) {
		receber();
	}
}
