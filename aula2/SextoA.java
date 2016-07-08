//Tipos primitivos - Idade em milisegundos - 1:30:00
package aula2;

import java.util.Scanner;

public class SextoA {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println(idade*365L*24*60*60*1000);
		/*A letra L foi inserida no 365, pois o processamento é realizado da esquerda para a direita, e nesse caso, o cálculo interpreta
		o Long logo no número 365*/
	}
}
