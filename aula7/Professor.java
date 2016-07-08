package aula7;

public class Professor {
	private String nome;
	private String sobrenome;
	private int rp;
	private double avaliacao;
	private double salario;
	private boolean periodo;
	
	
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
	public int getRp() {
		return rp;
	}
	public void setRp(int rp) {
		this.rp = rp;
	}
	public double getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public boolean isPeriodo() {
		return periodo;
	}
	public void setPeriodo(boolean periodo) {
		this.periodo = periodo;
	}
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", sobrenome=" + sobrenome + ", rp="
				+ rp + ", avaliacao=" + avaliacao + ", salario=" + salario
				+ ", periodo=" + periodo + ", getNome()=" + getNome()
				+ ", getSobrenome()=" + getSobrenome() + ", getRp()=" + getRp()
				+ ", getAvaliacao()=" + getAvaliacao() + ", getSalario()="
				+ getSalario() + ", isPeriodo()=" + isPeriodo() + "]";
	}
	
	
}
