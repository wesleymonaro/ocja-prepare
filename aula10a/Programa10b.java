package aula10a;

class B{
	B(){
		System.out.println("Invoca��o do construtor B()");
	}
}

class C extends B{
	C(){
		super();//O super() sempre est� presente no caso da subclasse
		System.out.println("Construtor C()");
	}
}

public class Programa10b {
	public static void main(String[] args) {
		C x = new C();
	}
}
