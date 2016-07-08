package aula6;

public class CarroTeste1 {
	public static void main(String[] args) {
		Carro c1;
		c1 = new Carro();
		Carro c2 = new Carro();
		Carro c3 = new Carro();
		Carro c4 = new Carro();
		Carro carroDoProfessorLobo = new Carro();
		
		c1.exibirAtributos();
		carroDoProfessorLobo.exibirAtributos();
		System.out.println(carroDoProfessorLobo.marca);
		
	}
}
