package aula9;

interface A {
	void metodoX();

	void metodoY();
}

interface B {
	void metodoW();
}

class C implements A, B {
	public void metodoX() {
	}

	public void metodoY() {
	}

	public void metodoW() {
	}

	public String metodoZ() {
		return "Fretz";
	}
}

interface Juntavel extends A, B {
	void juntar();
}

abstract class D implements Juntavel {
	public void metodoX() {
	}

	public void metodoY() {
	}

	public void metodoW() {
	}
}

class E extends D {
	public void juntar() {

	}
}

public class Programa7a {

}
