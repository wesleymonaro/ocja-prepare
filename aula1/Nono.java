package aula1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Nono {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma;
		
		System.out.print("Digite o primeiro número");
		numero1=entrada.nextInt();
		System.out.print("Digite o segundo número");
		numero2=entrada.nextInt();
		
		soma=numero1+numero2;
		
		System.out.print("A soma dos dois números é: " +soma);
		
		
		
	}

}
