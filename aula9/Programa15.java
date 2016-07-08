package aula9;

public class Programa15 {
	static void dividir(int x, int y){
		int quociente = 0;
		try {
			quociente = x/y;
		} catch (ArithmeticException e) {
			System.out.println("Resolução no métido dividir()");
		}
	}
	static void testar(){
		dividir(6, 0);
	}
	static void resultar(){
		testar();
	}
	public static void main(String[] args) {
		resultar();
	}
}
