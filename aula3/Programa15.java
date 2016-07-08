package aula3;

import java.util.Scanner;

public class Programa15 {
	public static void main(String[] args) {
		int nota;
		double soma = 0;
		int contador = 1;
		int n = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a quantidade de alunos: ");
		n = entrada.nextInt();

		while (contador <= n) {
			System.out.print("Digite a nota do " + contador + "º aluno: ");
			nota = entrada.nextInt();
			if (nota < 0 || nota > 10) {
				System.out.println("Nota deve ser entre 0 e 10");
				contador--;
			} else {
				soma += nota;
			}
			contador++;
		}
		System.out.println("Média da sala: " + (soma / n));
	}
}
