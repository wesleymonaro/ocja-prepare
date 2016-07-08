//0:52:30

package aula5;

public class Programa5 {
	public static void main(String[] args) {
		char [] letras = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		for (int contador = 0; contador < letras.length; contador++) 
			System.out.print(letras[contador] + " ");
			
		System.out.println("\n");
		
		System.out.println(letras[3]);
		System.out.println(letras);
		
	}
}
