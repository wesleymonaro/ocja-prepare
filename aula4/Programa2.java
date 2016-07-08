//0:29:00
//Fatorial decrescente com FOR
package aula4;

public class Programa2 {
	public static void main(String[] args) {
		int n = 5;
		for (long contador = n, fatorial = 1; contador >= 1; contador--) {
			fatorial = fatorial * contador;
			System.out.println(fatorial + " ");
		}
	}
}
