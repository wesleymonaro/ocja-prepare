//0:10:00
package aula6;

public class Programa1 {
	public static void main(String[] args) {
		int a=10;
		int []b;//declara��o de um array de ints
		//int a,b[]; - Mesma coisa
		int c[][];
		int []d[];
		int []e,f;//nesse caso o colchete inserido antes do "e" faz com que o "f" herde a dimens�o do "e"
		//int e[],f;/nesse caso o f � uma vari�vel comum.
		f = new int[20];
		
		char []g[][],h,i[][];//o g � um array tridimensional e o h � um array de char comum
		//char [][]g[],h[],i[][];// o h se torna tridimensional poi herda duas do g e mais uma dele mesmo. o i � tetradimensional
		i = new char [3][4][2];
		i[2][3][1]='a';
		
	}
}
