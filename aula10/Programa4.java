package aula10;

class MinhaExcecao extends Exception{
	void metodoA(int idade) throws MinhaExcecao{
		if(idade<18)
			throw new MinhaExcecao();
	}
}

public class Programa4 {
	public static void main(String[] args) {
		MinhaExcecao me = new MinhaExcecao();
		try {
			me.metodoA(15);
		} catch (Exception e) {
			System.out.println("Idade maior tem que ser > 18");
		}
	}
}
