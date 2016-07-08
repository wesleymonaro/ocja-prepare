//0:57:00
package aula8a;

abstract class Funcionario extends Object {
	double ganharSalario() {
		return 1000;
	}

	abstract String trabalhar();
}

class Medico extends Funcionario {
	double ganharSalario() {
		return 2000;
	}

	String trabalhar() {
		return "Cuidar das pessoas";
	}
}

class Professor extends Funcionario {
	double ganharSalario() {
		return 3000;
	}

	String trabalhar() {
		return "Lecionar";
	}
}

class Engenheiro extends Funcionario {
	double ganharSalario() {
		return 4000;
	}

	String trabalhar() {
		return "Construir";
	}
}

class EngenheiroEletrico extends Engenheiro {
	String trabalhar() {
		return "Instalações Elétricas";
	}
}

public class Teste2 {
	public static void main(String[] args) {
		Funcionario m = new Medico();
		Funcionario p = new Professor();
		Funcionario e = new Engenheiro();
		Funcionario ee = new EngenheiroEletrico();

		double total = 0;

		Funcionario[] lista = { m, m, m, p, p, p, e, ee, ee, ee, ee, ee, e, e,
				p, p, p, m, m, m };

		for (Funcionario d : lista)
			System.out.println(d.trabalhar());

	}
}
