//Tipos primitivos - Idade em milissegundos
package aula2a;

import java.util.Scanner;

public class SextoA {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade=entrada.nextInt();
		
		System.out.println(idade*365L*24*60*60*1000);
	}
}
