//1:28:00
package aula8a;

abstract class A extends Object{
	abstract void metodoX();
	abstract void metodoY();
	void metodoW(){};
	void metodoZ(){};
}

abstract class B extends A{
	void metodoX(){}
	void metodoM(){}
	void metodoN(){}
}

class C extends B{
	void metodoY(){}
}

class D extends C{
	
}

public class Teste3 {

}
