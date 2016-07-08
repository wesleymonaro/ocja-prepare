package aula10;

abstract class Empregado{
	abstract Graduado trabalhar();
}
class Gerente extends Empregado{
	Graduado trabalhar(){
		return new Doutor();
	}
}
class Diretor extends Gerente{
	Especialista trabalhar(){
		return new Doutor();
	}
}
class Presidente extends Diretor{
	Mestre trabalhar(){
		return new Doutor();
	}
}