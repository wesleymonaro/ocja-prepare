//4:01:00
//fatorial
package aula3;


public class Programa14b {
	public static void main(String[] args) {
		int n = 5, fatorial = 1;
		
		for(int contador=1; contador<=n; contador++){
			fatorial = fatorial*contador;
		}
		System.out.println(fatorial);
	}
}