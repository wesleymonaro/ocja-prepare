package aula9;

interface Abrivel{
	void abrir();
}

interface Fechavel {
	public void fechar();
}

interface Removivel {
	public abstract double remover(int x);
}

interface Recebibel {
	abstract public double receber(boolean b);
	public abstract double pagar(char d);
}

interface Transferivel{
	boolean controle=false;
	public char cor='b';
	public static double quantia=10.2;
	public static int salario=1000;
	public static final boolean modelo=true;
	
	boolean tranferir();
	char alertar();
}
public class Programa7 {

}
