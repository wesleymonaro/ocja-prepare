package aula5;

public class Programa10b {
	public static void main(String[] args) {
		String [] evangelhos= {"Pedro", "Paulo", "Lucas", "Marcos", "João"};
		int quantidade = 0;
		for (String apostolo:evangelhos) {
			if (apostolo.charAt(0)=='P')
				quantidade++;
			System.out.print(apostolo + " ");
			
		}
		System.out.print("\nQuantidade que começa com P: " + quantidade);
	}
}
