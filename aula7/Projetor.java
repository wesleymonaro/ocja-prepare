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
		System.out.println("A marca �: " + marca);
		System.out.println("O pre�o �: " + preco);
	}*/
}
