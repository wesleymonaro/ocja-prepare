//0:59:50
package aula5;

public class Programa14 {
	public static void soma(double...lista){
		double total=0;
		for(double elemento:lista)
			total=total+elemento;
		System.out.println("Soma: " + total);
	}
	
	public static void main(String[] args) {
		soma(1,2,3,4,5,6,5,9,8,7,9,5,9,5,9,5,65,4,6,5,6,6,5,9,5,9,5,9,5,9,5);
		soma(1);
		soma();
	}
}
