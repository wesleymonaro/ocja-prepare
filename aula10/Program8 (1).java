package aula10;

interface Vegetal{
	Vegetal reproduzir() throws Throwable;
}

class Arvore implements Vegetal{
	public Vegetal reproduzir() throws Exception{return new Laranjeira();}
}

class Angiosperma extends Arvore{
	public Angiosperma reproduzir() throws RuntimeException{return new Laranjeira();}
}

class Laranjeira extends Angiosperma{
	public Laranjeira reproduzir() throws NullPointerException{return new Laranjeira();}
}