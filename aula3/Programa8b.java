//1:33:20
package aula3;

public class Programa8b {
	public static void main(String[] args) {
		int codigo = 10;
		final int a=4;
		final int b=6;
		
		switch (codigo) {
		case 1:
			System.out.println("Voc� digitou 1");
			break;

		case a+b: //aqui s� funciona com constantes - Explica��o em 1:43:00
			System.out.println("Agora sim! Case 10");
			break;
		}
	}
}
