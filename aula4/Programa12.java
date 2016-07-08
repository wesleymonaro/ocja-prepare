//1:32:10
package aula4;

import java.util.Scanner;

public class Programa12 {
	public static void determinaAprovacao(){
		Scanner entrada = new Scanner(System.in);
		double media=0;
		String resultado=" ";
		
		System.out.println("Digite a média: ");
		media=entrada.nextDouble();
		
		if(media>=7)
			resultado="Aprovado";
		else if(media>=5)
			resultado = "Exame";
		else
			resultado = "Reprovado";
		
		System.out.println("Resultado: " + resultado);
	}
	public static void main(String[] args) {
		determinaAprovacao();
	}
}
