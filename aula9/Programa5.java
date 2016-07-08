package aula9;
interface Recebivel{
	double receber();
}
class Salario implements Recebivel{
	public double receber(){
		return 100;
	}
}
class Promissoria implements Recebivel{
	public double receber(){
		return 200;
	}
}
class Duplicata implements Recebivel{
	public double receber(){
		return 300;
	}
}
public class Programa5 {
	public static void main(String[] args) {
		double total = 0;
		Recebivel [] r = new Recebivel[3];
		r[0] = new Salario();
		r[1] = new Promissoria();
		r[2] = new Duplicata();
		
		Recebivel s = new Salario();
		Recebivel p = new Promissoria();
		Recebivel d = new Duplicata();
		Recebivel rec []={s,s,s,s,s,p,p,p,s,s,s,s,p,d,d,d,d,d};
		
		for (Recebivel x: rec)
			total +=x.receber();
		System.out.println("O total vale " + total);
		
	}
}
