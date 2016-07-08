package aula4;
//fatorial crescente com FOR

public class Programa1 {
	public static void main(String[] args) {
		int n = 5;
		for (int contador = 1, fatorial = 1; contador <= n; contador++) {
			fatorial = fatorial*contador;
			
			System.out.println(fatorial + " ");
		}
	}
}
