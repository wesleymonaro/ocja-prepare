//3:09:45
/*EXEMPLO DE SOBRECARGA DE MÉTODOS
É o mecanismo a partir do qual métodos de uma mesma classe possuem diferentes assinaturas.
O que define Assinaturas de métodos:
1- Quantidade de argumentos;
2- Tipo de argumento
3- Ordem dos argumentos
*/


package aula4;

public class Programa27 {
	public static void soma(int a, int b){
		System.out.println(a+b);
	}
	
	public static void soma(int a, int b, int c){
		System.out.println(a+b+c);
	}
	
	public static void soma(double a, double b, double c){
		System.out.println(a+b+c);
	}
	
	public static void soma(double a, int b){
		System.out.println(a+b);
	}
	
	public static void soma(int a, double b){
		System.out.println(a+b);
	}
	
	//main
	public static void main(String[] args) {
		soma(10, 20);
		soma(10,20,40);
		soma(1.25,3.12,8.97);
		soma(5.2,30);
		soma(30,6.3);
	}
}
