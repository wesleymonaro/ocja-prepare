package aula2;

/*
 * byte - 8 bits - -128 a 127
 * short - 16 bits
 * int - 32 bits
 * long - 64 bits
 * float - 32 bits
 * double - 64 bits
 * char - 16 bits
 * boolean - true ou false
 */

public class SextoExemplo {
	public static void main(String[] args) {
		byte a = 127;
		byte b = 8;
		byte c = (byte) (a+b);
		//int d= (int)10L;
		
		System.out.println(c);
		
		float fretz = (float) 12.0;
		float fretz2 = 12.0f;
	}
}
