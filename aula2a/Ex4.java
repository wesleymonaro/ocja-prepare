package aula2a;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		String lugar;

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o local: ");
		lugar = entrada.next();
		
		switch(lugar){
		case "Escola": case "ESCOLA": case "escola":
			System.out.println("Estudar");
			break;
		case "Banco": case "BANCO": case "banco":
			System.out.println("Pagar conta");
			break;
		case "Farm�cia": case "FARM�CIA": case "farm�cia":
			System.out.println("Comprar rem�dios");
			break;
		case "Casa": case "CASA": case "casa":
			System.out.println("Descansar");
			break;
		case "Correio": case "CORREIO": case "correio":
			System.out.println("Remeter Cartas");
			break;
		default:
			System.out.println("Local inv�lido");
		}
	}
}
