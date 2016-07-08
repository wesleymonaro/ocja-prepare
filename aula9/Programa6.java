package aula9;

interface Naipe{
	String PAUS="Zap";
	String COPAS="Copeta";
	String ESPADAS="Espadilha";
	String OUROS="Pica fumo";
}
class Jogador{
	public void jogar(String n){
		System.out.println(n);
	}
}
public class Programa6{
	public static void main(String[] args) {
		Jogador j = new Jogador();
		j.jogar(Naipe.PAUS);
	}
}
