package aula9;

abstract class X{
	abstract void metodoA();
	abstract void metodoB();
	abstract void metodoC();
	abstract void metodoD();
	void metodoE(){}
}

abstract class Y extends X{		//EXEMPLO DE CLASSE ADAPTER - CLASSE QUE NÃO FAZ NADA


}

class Z extends Y{
	void metodoC(){}
	void metodoD(){}
	void metodoA(){}
	void metodoB(){}
}

public class Programa1 {

}
