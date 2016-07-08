//gravação interrompida
package aula5;

public class Programa10a {
	public static void main(String[] args) {
		int lista [] = new int[] {3,4,5};
		int contPar = 0;
		int contImpar = 0;
		
		for (int elemento:lista) {
			switch (elemento%2) {
			case 0:
				contPar++;
				break;
			case 1:
				contImpar++;
			default:
				break;
			}
		}
		System.out.println("Quantidade de pares: " + contPar);
		System.out.println("Quantidade de ímpares: " + contImpar);
		System.out.println("Total de elementos do array: " + lista.length);
	}
}
