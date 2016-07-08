package aula2a;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int opcao;
		int lado, altura, base, base_maior, base_menor;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Selecione a figura pelo número");
		System.out.println("1 - Quadrado \n2 - Triângulo"
				+ "\n3 - Retângulo \n4 - Trapézio");
		opcao = entrada.nextInt();


		switch (opcao) {
		case 1:
			System.out.println("Quadrado");
			System.out.print("Digite o lado: ");
			lado = entrada.nextInt();
			System.out.println("Área: " + (lado*lado));
			break;
		case 2:
			System.out.println("Triângulo");
			System.out.print("Digite a base: ");
			base = entrada.nextInt();
			System.out.print("Digite a Altura: ");
			altura = entrada.nextInt();
			System.out.println("Área: " + (base*altura)/2);
			break;
		case 3:
			System.out.println("Retângulo");
			System.out.print("Digite a base: ");
			base = entrada.nextInt();
			System.out.print("Digite a Altura: ");
			altura = entrada.nextInt();
			System.out.println("Área: " + (base*altura));
			break;
		case 4:
				System.out.println("Trapézio");
				System.out.print("Digite a base menor: ");
				base_menor = entrada.nextInt();
				System.out.print("Digite a base: ");
				base_maior = entrada.nextInt();
				System.out.print("Digite a Altura: ");
				altura = entrada.nextInt();
				System.out.println("Área: " + ((base_maior+base_menor)*altura)/2);
			
			break;
		default:
			System.out.println("Opção Inválida");
		}
	}
}
