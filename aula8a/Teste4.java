//1:44:00
package aula8a;

abstract class X{
	abstract void metodoA();
	abstract void metodoB();
	abstract void metodoC();
}

abstract class  Y extends X{
	void metodoA(){}
}

abstract class W extends Y{
	void metodoB(){}
}

class Z extends W{
	void metodoC(){}
}

public class Teste4 {

}
