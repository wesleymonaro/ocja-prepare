//2:29:00
package aula3;

import java.util.Scanner;

public class Programa14 {
	public static void main(String[] args) {
		int contador = 1, parcela = 0, n=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a quantidade de parcelas: ");
		n = entrada.nextInt();

		
		//while
		while (contador <= n) { //pode ocorrer dessa forma com operador ternário: while (contador <= 10?true:false) {
			parcela = (int) Math.pow(2, 2*contador);			
			System.out.print(parcela + " ");
			contador++;
		}

/*		//do while
		do {
			parcela = contador;
			System.out.print(parcela + " ");
			contador++;
		} while (contador <= n);*/
	}
}
