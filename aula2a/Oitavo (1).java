//Área do círculo
package aula2a;

import java.util.Scanner;

public class Oitavo {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double raio, area;
		
		System.out.print("Digite o raio: ");		
		raio=entrada.nextDouble();
		
		//area=Math.PI*raio*raio;
		area=Math.PI*Math.pow(raio,2);
		
		System.out.println("Valor da área do círculo: " + area);
		System.out.printf("%s%.2f","Valor da área do círculo: ",area);
	}
}
