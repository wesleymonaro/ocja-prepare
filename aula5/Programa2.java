//0:31:40
package aula5;

public class Programa2 {
	public static void main(String[] args) {
		int [] lista= new int[10];
		//int lista[]= new int[10]; - Cochetes podem estar antes ou depois
		lista[0]=10;
		lista[1]=11;
		lista[2]=12;
		lista[3]=13;
		lista[4]=14;
		lista[5]=-12;
		lista[6]=11;
		lista[7]=12;
		lista[8]=13;
		lista[9]=19;
		
		int contador=0;
		
		while(contador<=9){
			System.out.print(lista[contador]+" ");
			contador++;
		}
	}
}
