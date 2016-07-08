package aula6;

import java.util.Scanner;

public class Conta {
	private double saldo = 1000;
	int escolha;

	public void menuEscolher() {
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Esolha a opção:");
			System.out.println("1. Sacar");
			System.out.println("2. Depositar");
			System.out.println("3. Ver Extrato");
			System.out.println("4. Sair");
			escolha = entrada.nextInt();

			if (escolha != 4) {
				switch (escolha) {
				case 1:
					System.out.print("Digite quanto deseja sacar: ");
					int valor = entrada.nextInt();
					sacar(valor);
					break;
				case 2:
					System.out.print("Digite quanto deseja depositar: ");
					valor = entrada.nextInt();
					depositar(valor);
					break;

				case 3:
					mostrarExtrato();
					break;
				}
			}
		} while (escolha != 4);
	}

	private double sacar(int quantia) {
		System.out.println("Saldo anterior: " + saldo);
		saldo = saldo - quantia;
		System.out.println("Saldo atual: " + saldo);
		System.out.println();
		return saldo;
	}

	private double depositar(int quantia) {
		System.out.println("Saldo anterior: " + saldo);
		saldo = saldo + quantia;
		System.out.println("Saldo atual: " + saldo);
		System.out.println();
		return saldo;
	}

	private void mostrarExtrato() {
		System.out.println("Saldo vale: " + saldo + "\n");
	}
}
