package aula9;

interface Exemplo{
	public static final String NOME = "Wesley";
}
class F {
	public void metofoG(String m){}
}
public class Programa6a {
	public static void main(String[] args) {
		F a=new F();
		a.metofoG(Exemplo.NOME);
	}
}
