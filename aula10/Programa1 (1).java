package aula10;

import java.io.IOException;

public class Programa1 {
	static void metodoA() throws IOException,ArithmeticException{ //O m�todoA tem o potencial de disparar uma excess�o IO
		int x=20;
		IOException e = new IOException();//Poderia tamb�m usar throw new IOException(); na linha abaixo, onde est� o throw e;
		if (x>19)
			throw e; //throw sem o S sempre estar� dentro do m�todo, e n�o na declara��o.
			throw new ArithmeticException();
	}
	static void metodoB(){
		try {
			metodoA();//Obrigatoriamente a chamada deste m�todo deve estar dentro do TRY, porque o metodoA pode disparar uma exce��o
		} catch (IOException e) {
			System.out.println("Tratando no m�todoB()");
		}
	}
	public static void main(String[] args) {
		metodoB();
	}
}
