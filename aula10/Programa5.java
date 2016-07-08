package aula10;

import java.io.*;

class A {
	void metodoX() throws Throwable {}
}
class B extends A{
	void metodoX() throws Exception{}
}
class C extends B{
	void metodoX() throws IOException{}
}
class D extends C{
	void metodoX() throws EOFException{}
}

