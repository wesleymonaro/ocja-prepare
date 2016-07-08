//1:40:00
package aula7;

public class A {
	A(){
		this("Roberto");
	}
	
	A(String nome){
		this("Roberto","Serson");
	}
	A(String nome, sobrenome){
		this("Roberto","Seron", 25);
	}
	A(String nome, String sobrenome, int idade){
		System.out.println("Construtores com this()");
	}
}
