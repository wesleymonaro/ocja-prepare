package aula9;

class Empregado{}
class Gerente extends Empregado{}
class Diretor extends Gerente{}

public class Programa14 {
	static void converter(){
		Empregado e = new Empregado();
		Empregado g = new Gerente();
		Empregado f = new Diretor();
		try {
			Diretor d=((Diretor)e);
		} catch (ClassCastException r) {
			 System.out.println("Exception.");
		}
		
	}
	public static void main(String[] args) {
		converter();
	}
}
