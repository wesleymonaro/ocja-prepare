//1:38:55
package aula5;

public class Programa8a {
	public static void main(String[] args) {
		int array[] = {-87, -68, -94, 100, -83, 78, 85, -91, 76, 87};
		int contPositivo = 0;
		
		for (int contador = 0; contador < array.length; contador++) 
			if (array[contador]>0)
				contPositivo++;
		

		
		System.out.printf("Quantidade de positivos: %d\n", contPositivo);
		System.out.println("Porcentagem: " + (1.0*contPositivo/array.length)*100 + "%");//1.08 promove todos os INT para DOUBLE
		System.out.printf("Porcentagem: %.2f%s", (1.0*contPositivo/array.length)*100 , "%\n");
		System.out.printf("Porcentagem: %.2f%%", (1.0*contPositivo/array.length)*100);
	}
}
