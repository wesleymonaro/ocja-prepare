//2:50:00
package aula4;

public class Programa21 {
	public static void calculaFatorial(int n){
		int fatorial = 1;
		for(int contador=1; contador<=n; contador++)
			fatorial=fatorial*contador;
		System.out.println("Valor do fatorial: " + fatorial);
	}
	public static void main(String[] args) {
		calculaFatorial(5);
	}
}
