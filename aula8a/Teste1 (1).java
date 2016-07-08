//0:20:00
package aula8a;

class Graduado extends Object{
	String oQueEuSou(){return "Graduado";}
	int determinarPotuacao(){return 1;}
	boolean realizarAulaTeste(){return false;}
}

class Especialista extends Graduado{
	String oQueEuSou(){return "Especialista";}
	int determinarPotuacao(){return 2;}
	boolean realizarAulaTeste(){return false;}
}

class Mestre extends Especialista{
	String oQueEuSou(){return "Mestre";}
	int determinarPotuacao(){return 3;}
	boolean realizarAulaTeste(){return false;}
}

class Doutor extends Mestre {
	String oQueEuSou(){return "Doutor";}
	int determinarPotuacao(){return 4;}
	boolean realizarAulaTeste(){return true;}
	
}

public class Teste1 {
	public static void main(String[] args) {
		Graduado g = new Graduado();
		Graduado e = new Especialista();
		Graduado m = new Mestre();
		Graduado d = new Doutor();
		
		Graduado [] lista = {g,g,g,e,e,m,m,m,m,e,e,g,g,e,g,e,g,d,d,d};
		
		int total=0;
		for (Graduado p:lista)
			total=total+p.determinarPotuacao();
		System.out.println(total);
		
		if(g instanceof Doutor)
			System.out.println(((Doutor)g).realizarAulaTeste());
	
	}
	
}
