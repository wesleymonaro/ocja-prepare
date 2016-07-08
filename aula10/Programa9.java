package aula10;

class Carro{
	void acelerar(){//aqui tem o modificador default, que nao é exibido
		
	}
}
class CarroEsportivo extends Carro{
	protected void acelerar(){
		
	}
}
class CarroUltraEsportivo extends CarroEsportivo{
	public void acelerar(){
		
	}
}
