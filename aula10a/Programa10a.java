package aula10a;

class A{
	A(){
		this(10);
		System.out.println("Invoca��o do construtor A()");
	}
	A(int x){
		System.out.println("Invoca��o do contrutor A(int)");
	}
}

public class Programa10a {
	public static void main(String[] args) {
		A logan = new A();
	}
}
