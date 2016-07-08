package aula7b;

public class Empregado extends Object {
	String nome = "Roberto";
	String sobrenome="Serson";
	int idade=23;
	int cpf=12345678;
	boolean certificado=true;
	double salario=0;
	
	void comer(){}
	void beber (){}
	void tirarFeriasDestino(){
		System.out.println("Piscinão local");
	}
	double receberSalario(){return 1000;}
	
	public String toString(){
		return nome
				+ " "
				+ sobrenome
				+ " "
				+ idade
				+ " "
				+cpf
				+ " "
				+certificado
				+ " "
				+salario;
	}
			
}
