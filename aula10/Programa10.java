package aula10;

class Cachorro extends Object{
	String nome;
	String sobrenome;
	Cachorro(){
		this("João");
	}
	Cachorro(String nome){
		this("João","Da Rua");
	}
	Cachorro(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
}
class Retriever extends Cachorro{
	String nomeRacao;
	Retriever(){
		super();
		System.out.println("Invocação do construtor Cachorro()");
	}
	Retriever(String nomeRacao){
		super("Téo");
		this.nomeRacao="Pedigree";
		System.out.println("Invocação do construtor Cachorro(String)");
	}
	Retriever(int x, int y, int z){
		super("Téo", "Da Praia");
		System.out.println("Invocação do construtor Cachorro(String, String)");
	}
}
public class Programa10{
	public static void main(String[] args) {
		new Retriever();
		new Retriever("Ziraldo");
		new Retriever(10,20,40);
	}
}