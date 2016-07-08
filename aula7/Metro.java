package aula7;

public class Metro extends Object {
	private String marca;
	private int numPortas;

	Metro(String m) {
		setMarca(m);
	}

	Metro() {
		System.out.println("Sem Argumento");
	}

	Metro(String s, int i) {
		setMarca(s);
	}

	public void setMarca(String m){
		if(m.equals("Siemens")||m.equals("Alstom")||m.equals("Dassault"))
			marca=m;
		else
			System.out.println();
	}
}
