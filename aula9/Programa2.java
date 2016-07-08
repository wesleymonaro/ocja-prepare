//0:49:00
package aula9;

interface Gravavel{
	void gravar();
}

class Gravador implements Gravavel{
	public void gravar(){}
}

class BancoDeDados implements Gravavel{
	public void gravar(){}
}

public class Programa2 {
	public static void main(String[] args) {
		Gravavel g1 = new Gravador();
		Gravavel g2 = new BancoDeDados();
		
		((BancoDeDados)g2).gravar();	//Casting para usar o método gravar dentro da classe BancoDeDados
		
		if(g1 instanceof Gravador)
			((Gravador)g1).gravar();
	}
}
