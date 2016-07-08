//0:06:00
//SOBREPOSIÇÃO - OVERRIDE
//Um arquivo pode ter infinitas classes, mas somente UMA pode ser public, que é a classe que dá nome ao arquivo.
package aula8a;

abstract class Empregado extends Object{
	abstract double receberSalario();

abstract class Gerente extends Empregado{
	abstract double receberSalario();
}

class Diretor extends Gerente {
	double receberSalario(){return 10000;}
}

class Presidente extends Diretor {
	double receberSalario(){return 20000;}
}

public class Teste {
	public static void main(String[] args) {
		
		Empregado d = new Diretor();
		Empregado p = new Presidente();
		//Exemplo de polimorfismo, todos são empregados.
		
		Empregado [] lista = {d};
		double total = 0;
		
		for(Empregado x:lista)
			total = total + x.receberSalario();
		
		System.out.println(total);
		
	}}

