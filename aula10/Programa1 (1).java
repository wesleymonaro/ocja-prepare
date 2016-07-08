package aula10;

import java.io.IOException;

public class Programa1 {
	static void metodoA() throws IOException,ArithmeticException{ //O métodoA tem o potencial de disparar uma excessão IO
		int x=20;
		IOException e = new IOException();//Poderia também usar throw new IOException(); na linha abaixo, onde está o throw e;
		if (x>19)
			throw e; //throw sem o S sempre estará dentro do método, e não na declaração.
			throw new ArithmeticException();
	}
	static void metodoB(){
		try {
			metodoA();//Obrigatoriamente a chamada deste método deve estar dentro do TRY, porque o metodoA pode disparar uma exceção
		} catch (IOException e) {
			System.out.println("Tratando no métodoB()");
		}
	}
	public static void main(String[] args) {
		metodoB();
	}
}
