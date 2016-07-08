//3:52:00
package aula3;

public class Programa14a {
	public static void main(String[] args) {
		int n = 10;
		for (int contador = 1, parcela = 0; contador <= n; contador++) {
			parcela = contador;
			parcela=(int)Math.pow(2, contador);
			System.out.print(parcela + " ");
		}
	}
}