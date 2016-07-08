//calcular média
package aula5;

public class Programa14a {
	public static void calculaMedia(double...lista){
		double soma=0;
		for(double elemento:lista)
			soma=soma+elemento;
		
		System.out.println("Média da turma: " + soma/lista.length);
	}
	
	
	public static void main(String[] args) {
		
		calculaMedia(1,2,3,4,5,6,5,9,8,7,9,5,9,5,9,5,65,4,6,5,6,6,5,9,5,9,5,9,5,9,5);
		calculaMedia(1,5,9);
	}
}
