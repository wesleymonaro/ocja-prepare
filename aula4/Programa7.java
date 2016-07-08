//0:47:00
//switch case - sem break, default no meio e sem default
package aula4;

import java.util.Scanner;

public class Programa7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String modelo;
		
		
		System.out.print("Escolha o modelo: \n" + 
	"Passat\n" +
	"Golf\n" +
	"Fox\n"+
	"Gol\n");
	
		modelo = entrada.next();
		
		switch (modelo) {
		case "Passat":
			System.out.println("Acrescentar câmbio Automático");
			System.out.println("Acrescentar 6 Cilindros");
			
		case "Golf":
			System.out.println("Acrescentar banco de couro");
			System.out.println("Acrescentar ar condicionado");
		
		case "Fox":
			System.out.println("Acrescentar pintura metálica");
		
		case "Gol":
			System.out.println("Acrescentar protetor de cárter");
			
		default:
			System.out.println("Acrescentar Motor");
			System.out.println("Acrescentar volante");
			System.out.println("Acrescentar carroceria");
			System.out.println("Acrescentar Pneus");
		}
	}
}
