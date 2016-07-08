//3:30:50
package aula4;

public class Programa28 {
	public static double calculaComprimentoCircunferencia(int raio) {
		return 2*Math.PI*raio;
	}
	public static void main(String[] args) {
		double resultado = calculaComprimentoCircunferencia(10);
		System.out.println(resultado);
	}
}
