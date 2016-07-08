//1:16:00
package aula9;

interface Voavel{
	String voar();
}

class Aviao implements Voavel{
	public String voar(){
		return "Avião voando";
	}
}
class Mosca implements Voavel{
	public String voar(){
		return "Mosca voando";
	}
}
public class Programa4 {
	public static void main(String[] args) {
		Voavel a = new Aviao();
		Voavel m = new Mosca();
		System.out.println(a.voar());
		System.out.println(m.voar());
	}
}
