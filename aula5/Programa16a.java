package aula5;

public class Programa16a {
	public static void main(String[] args) {
		int [][] lista ={{7,6,5,4},{5,6,7,9},{8},{1,2,3,4,5}};
		
/*		System.out.println(lista[0][2]);
		System.out.println(lista[2][0]);*/
		
		for (int linha[]:lista) {
			for(int elemento:linha)
				System.out.print(elemento+" ");
				System.out.println();
		}
	}
}
