package aula10;

class Cachorro extends Object{
	String nome;
	String sobrenome;
	Cachorro(){
		this("Jo�o");
	}
	Cachorro(String nome){
		this("Jo�o","Da Rua");
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
		System.out.println("Invoca��o do construtor Cachorro()");
	}
	Retriever(String nomeRacao){
		super("T�o");
		this.nomeRacao="Pedigree";
		System.out.println("Invoca��o do construtor Cachorro(String)");
	}
	Retriever(int x, int y, int z){
		super("T�o", "Da Praia");
		System.out.println("Invoca��o do construtor Cachorro(String, String)");
	}
}
public class Programa10{
	public static void main(String[] args) {
		new Retriever();
		new Retriever("Ziraldo");
		new Retriever(10,20,40);
	}
}