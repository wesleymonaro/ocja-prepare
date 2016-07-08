package aula9;

class Carro {

}

public class Programa10a {
	static void analisar() {
		Carro c1 = new Carro();
		c1 = null;
		try {
			c1.getClass();
		} catch (NullPointerException e) {
			System.out.println("Nulo!");
		}

	}

	public static void main(String[] args) {
		analisar();
	}
}
