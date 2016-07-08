package aula6;
//grito aos 2:10:00

public class AlunoTeste {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.nome = "Roberto";
		a.sobrenome = "Serson";
		a.id = 10;
		a.media = 9.5;
		/*a.realizarMatricula();
		a.solicitarMedia();
		a.fazerProva();
		System.out.println(a);
		a.mostrarAtributos();*/
		
		System.out.println(a);

		Aluno b = new Aluno();
		b.nome = "Wesley";
		b.sobrenome = "Monaro";
		b.id = 20;
		b.media = 9.0;
/*		b.realizarMatricula();
		b.solicitarMedia();
		b.fazerProva();		
		b.mostrarAtributos();*/
		System.out.println(b);
	}
}
