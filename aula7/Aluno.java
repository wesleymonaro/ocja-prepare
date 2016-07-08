//0:07:30
package aula7;

public class Aluno {
	private String nome = "Wesley";
	private String sobrenome;
	private double nota;
	private boolean aprovado = true;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		if(aprovado)
			this.nota=nota;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

}
