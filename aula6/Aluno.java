package aula6;

public class Aluno extends Object {//toda classe que não tem extends por padrão sempre estende a classe Object
	String nome;
	String sobrenome;
	int id;
	double media;
	
	public String toString(){
		return nome + " " + sobrenome + " " + id + " " + media + "\n";
	}
	
/*	public void fazerProva(){
		System.out.println("Aluno fazendo prova");
	}
	public void realizarMatricula(){
		System.out.println("Aluno se matriculando");
	}
	public void solicitarMedia(){
		System.out.println("Aluno solicitando a média");
	}
	public void mostrarAtributos(){
		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: "+ sobrenome);
		System.out.println("ID: " + id);
		System.out.println("Media: " + media + "\n");
	}*/
}
