//1:37:00
package aula7;

public class Projetor {
	
	Projetor(){
		System.out.println("Projetor()");
	}
	
	Projetor (String marca){
		this();
		System.out.println("Segundo construtor " + marca);
	}
	
	/*Projetor(String marca, double preco){
		System.out.println("A marca é: " + marca);
		System.out.println("O preço é: " + preco);
	}*/
}
