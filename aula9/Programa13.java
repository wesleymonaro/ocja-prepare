package aula9;

import java.util.IllegalFormatConversionException;

public class Programa13 {
	static void verificar(){
		try {
			System.out.printf("%d", 10.2);
		} catch (IllegalFormatConversionException m) {
			System.out.println("Convers�o Ilegal!!!");
		}
	}
	public static void main(String[] args) {
		verificar();
	}
}
