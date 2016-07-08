//0:41:20
package aula4;
//Fatorial com Do While Decrescente

public class Programa5 {
	public static void main(String[] args) {
		int n = 5, contador = n, fatorial = 1;
		do {
			fatorial = fatorial * contador;
			System.out.println(fatorial);
			contador -= 1;
		}while (contador >= 1);
	}
}
