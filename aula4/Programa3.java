//0:33:50
//Fatorial com While
package aula4;

public class Programa3 {
	public static void main(String[] args) {
		int n = 5, contador = 1, fatorial = 1;
		while (contador <= n) {
			fatorial = fatorial * contador;
			System.out.println(fatorial);
			contador += 1;
		}
	}
}
