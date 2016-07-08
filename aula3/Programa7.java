//0:35:40
//primeiro exercício da aula 2
package aula3;

import java.util.Scanner;

public class Programa7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double preco;
		int codigo;
		
		System.out.println("Digite o preço do produto: ");
		preco = entrada.nextDouble();
		System.out.println("Digite o código de origem: ");
		codigo = entrada.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.println("Preço do produto: " + preco);
			System.out.println("Procedencia Norte");
			break;
		case 2: case 5 : case 9:
			System.out.println("Preço do produto: " + preco);
			System.out.println("Procedencia Sul");
			break;
		case 3: case 10: case 11:  case 12: case 13: case 14: case 15:
			System.out.println("Preço do produto: " + preco);
			System.out.println("Procedencia Leste");
			break;
		case 7: case 20:
			System.out.println("Preço do produto: " + preco);
			System.out.println("Procedencia Oeste");
			break;

		default:
			System.out.println("Preço do produto: " + preco);
			System.out.println("Importado");
			break;
		}
	}
}
