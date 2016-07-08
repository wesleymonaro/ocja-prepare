//0:56:00
//Construtor é um método especial invocado o momento da instanciação, nao possui tipo de retorno e tem o mesmo nome da classe
package aula7;

public class Televisao {
	private String marca;
	
	Televisao(String marca) {
		setMarca(marca);
	}
	
	public void setMarca(String marca){
		if(marca.equals("Sony")||marca.equals("LG")||marca.equals("CCE"))
			this.marca=marca;
		else
			System.out.println("Marca inválida");
	}

	@Override
	public String toString() {
		return "Televisao [marca=" + marca + "]";
	}
	
	
}
