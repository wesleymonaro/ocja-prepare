package aula9;

import java.util.MissingFormatArgumentException;

public class Programa12 {
	static void verificar(){
		try {
			System.out.printf("%s%s", "Wesley");
		} catch (MissingFormatArgumentException e) {
			System.out.println("Verifique falta de argumentos");
		}
	}
	public static void main(String[] args) {
		verificar();
	}
}
