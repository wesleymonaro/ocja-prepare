package aula9;

import java.io.IOException;

public class Programa19 {
	static void metodoA() throws IOException{}
	
	static void metodoB(){
		try {
			metodoA();
		} catch (IOException e) {
			System.out.println("Tratando no métodoB()");
		}
	}
	
	public static void main(String[] args) {
		metodoB();
	}
	
	
}
