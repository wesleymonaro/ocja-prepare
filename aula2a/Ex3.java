package aula2a;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int opcao;
		int lado, altura, base, base_maior, base_menor;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Selecione a figura pelo n�mero");
		System.out.println("1 - Quadrado \n2 - Tri�ngulo"
				+ "\n3 - Ret�ngulo \n4 - Trap�zio");
		opcao = entrada.nextInt();


		switch (opcao) {
		case 1:
			System.out.println("Quadrado");
			System.out.print("Digite o lado: ");
			lado = entrada.nextInt();
			System.out.println("�rea: " + (lado*lado));
			break;
		case 2:
			System.out.println("Tri�ngulo");
			System.out.print("Digite a base: ");
			base = entrada.nextInt();
			System.out.print("Digite a Altura: ");
			altura = entrada.nextInt();
			System.out.println("�rea: " + (base*altura)/2);
			break;
		case 3:
			System.out.println("Ret�ngulo");
			System.out.print("Digite a base: ");
			base = entrada.nextInt();
			System.out.print("Digite a Altura: ");
			altura = entrada.nextInt();
			System.out.println("�rea: " + (base*altura));
			break;
		case 4:
				System.out.println("Trap�zio");
				System.out.print("Digite a base menor: ");
				base_menor = entrada.nextInt();
				System.out.print("Digite a base: ");
				base_maior = entrada.nextInt();
				System.out.print("Digite a Altura: ");
				altura = entrada.nextInt();
				System.out.println("�rea: " + ((base_maior+base_menor)*altura)/2);
			
			break;
		default:
			System.out.println("Op��o Inv�lida");
		}
	}
}
