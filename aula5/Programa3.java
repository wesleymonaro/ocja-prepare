//0:37:00
package aula5;

public class Programa3 {
	public static void main(String[] args) {
		int [] lista={-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		//int [] lista=new int[]{-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1}; - com new int[] depois do igual também funciona
		
		System.out.println(lista.length);
		
		for (int contador = 0; contador < lista.length; contador++) {
			System.out.print(lista[contador]+ " ");
		}
	}
}
