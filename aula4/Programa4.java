//0:37:15
//Fatorial decrescente com While

package aula4;

public class Programa4 {
	public static void main(String[] args) {
		int n = 5, contador = n, fatorial = 1;
		while (contador >= 1) {
			fatorial = fatorial * contador;
			System.out.println(fatorial);
			contador -= 1;
		}
	}
}
