package aula6;

public class Carro {
	String marca = "Ford";
	String modelo = "Fusion";
	double preco = 120000.00;
	int numPortas = 5;
	char cor='P';
	
	public void virarEsquerda(){System.out.println("Carro virando à esquerda!");};
	public void virarDireita(){};
	public void aumentarVelocidade(){};
	public void diminuirVelocidade(){};
	public void darRe(){};
	public void estacionar(){};
	
	public void exibirAtributos(){
		System.out.println(marca);
		System.out.println(modelo);
		System.out.println(preco);
		System.out.println(numPortas);
		System.out.println(cor);
	}
}
