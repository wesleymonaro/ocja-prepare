//0:10:00
package aula6;

public class Programa1 {
	public static void main(String[] args) {
		int a=10;
		int []b;//declaração de um array de ints
		//int a,b[]; - Mesma coisa
		int c[][];
		int []d[];
		int []e,f;//nesse caso o colchete inserido antes do "e" faz com que o "f" herde a dimensão do "e"
		//int e[],f;/nesse caso o f é uma variável comum.
		f = new int[20];
		
		char []g[][],h,i[][];//o g é um array tridimensional e o h é um array de char comum
		//char [][]g[],h[],i[][];// o h se torna tridimensional poi herda duas do g e mais uma dele mesmo. o i é tetradimensional
		i = new char [3][4][2];
		i[2][3][1]='a';
		
	}
}
