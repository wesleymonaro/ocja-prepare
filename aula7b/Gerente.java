package aula7b;

public class Gerente extends Empregado {
	String departamento = "Vendas";
	
	void tirarFeriasDestino(){System.out.println("Maresias");}
	double receberSalario(){return 4000;}
	void contratar(){System.out.println("Gerente contrata");}
	
	public String toString(){
		return super.toString()+" "+departamento;
				
	}
}
