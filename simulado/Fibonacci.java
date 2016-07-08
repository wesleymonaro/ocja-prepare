package simulado;

public class Fibonacci {
	public static void main(String[] args){

        int n1 = 0;
        int n2 = 1;
        int resultado = n1 + n2;

        //Essa linha é só pra imprimir o ZERO inicial.
        System.out.println(n1);

        while(resultado <= 100){
            System.out.println(resultado);
            n1 = n2;
            n2 = resultado;
            resultado = n1 + n2;
        }
    }
}
