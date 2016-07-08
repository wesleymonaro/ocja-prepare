package aula5;

public class Programa1 {
	public static void main(String[] args) {
		int lista [];
		lista = new int[10];
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
		
		System.out.println(lista[3]);
		
		for (int contador = 0; contador < 10; contador++) {
			System.out.print(lista[contador]+" ");
		}
	}
}
