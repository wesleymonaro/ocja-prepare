package aula9;

public class Programa8 {
	static int dividir(int x, int y){
		int quociente=0;
		
		try {
			quociente=x/y;
			System.out.println("Parabéns");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getClass());
		}
		return quociente;
	}
	
	public static void main(String[] args) {
		System.out.println(dividir(5, 2));
		System.out.println(dividir(10, 5));
		System.out.println(dividir(100, 0));
	}
}
