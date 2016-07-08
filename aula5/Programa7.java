//1:15:50
package aula5;

public class Programa7 {
	public static void main(String[] args) {
		int array[]= {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		System.out.printf("%s%8s\n", "Índice", "Valor");
		
		for (int contador = 0; contador < array.length; contador++)
			System.out.printf("%5d%8d\n", contador, array[contador]);
	}
}
