//0:52:10
package aula5;

public class Programa13 {
	public static void soma(double a, double b){
		System.out.println(a+b);
	}
	
	public static void soma(double a, double b, double c){
		System.out.println(a+b+c);
	}
	
	public static void soma(double a, double b, double c, double d){
		System.out.println(a+b+c+d);
	}
	
	public static void soma(double [] lista){
		double total = 0;
		for(double elemento:lista)
			total+=elemento;
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		soma(1,2);
		soma(1,2,3);
		soma(1,2,3,4);
		soma (new double[]{1,2,3,6,5,6,3,2,32,3,2,3,2,3,2,3,2,3,2});
		
	}
}
