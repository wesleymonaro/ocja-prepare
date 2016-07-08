package aula10;

class Graduado{}
class Especialista extends Graduado{}
class Mestre extends Especialista{}
class Doutor extends Mestre{}

class X extends Object{
	Graduado metodoA(){
		return new Doutor();
	}
}

class Y extends X{
	Especialista metodoA(){
		return new Doutor();
	}
}

class W extends Y{
	Mestre metodoA(){
		return new Doutor();
	}
}

class Z extends W{
	Doutor metodoA(){
		return new Doutor();
	}
}

