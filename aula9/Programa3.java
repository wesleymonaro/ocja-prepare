package aula9;

interface Bonificavel {
	void receberBonus();
}

class Funcionario {
	public String getNome() {
		return "Jo�o da Silva";
	}
	
	public String getCargo(){
		return "Funcionario gen�rico";
	}
}

class Engenheiro extends Funcionario{
	public String getCargo(){
		return "Engenheiro";
	}
}

class Ger extends Funcionario implements Bonificavel{
	public String getCargo(){
		return "Gerente";
	}
	public void receberBonus(){
		System.out.println("Funcionario recebendo Bonus");
	}
}

public class Programa3 {

}
