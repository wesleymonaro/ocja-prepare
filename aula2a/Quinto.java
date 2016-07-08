//Comparação
package aula2a;

import java.util.Scanner;

public class Quinto {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int numero1, numero2;
		String resultado=" ";

		System.out.print("Digite o primeiro número: ");
		numero1=entrada.nextInt();

		System.out.print("Digite o segundo número: ");
		numero2=entrada.nextInt();

		if ( numero1 == numero2 )
			resultado = numero1 + " == " + numero2;
		if ( numero1 != numero2 )
			resultado = numero1 + " != " + numero2;
		if ( numero1 < numero2 )
			resultado = resultado + "\n" + numero1 + " < " + numero2;
		if ( numero1 > numero2 )
			resultado = resultado + "\n" + numero1 + " > " + numero2;
		if ( numero1 <= numero2 )
			resultado = resultado + "\n" + numero1 + " <= " + numero2;
		if ( numero1 >= numero2 )
			resultado = resultado + "\n" + numero1 + " >= " + numero2;	

		System.out.println(resultado);
	}
}
