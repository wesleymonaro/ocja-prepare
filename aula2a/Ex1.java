package aula2a;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		int origem;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a origem do produto");
		origem = entrada.nextInt();
		
		switch(origem){
		case 1:
			System.out.println("Norte");
			break;
		case 2: case 5: case 9:
			System.out.println("Sul");
			break;
		case 3: case 10: case 11: case 12: case 13: case 14: case 15:
			System.out.println("Leste");
			break;
		case 7: case 20:
			System.out.println("Oeste");
			break;
		default:
			System.out.println("Importado");
		
		}
		
	}
}
