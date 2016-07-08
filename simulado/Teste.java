package simulado;

import java.util.regex.Pattern;

public class Teste {
	public static void main(String[] args) {
		String semanas="Sabado,Domingo,Segunda,Sexta,Quarta"; 
		
	    String dias[] = semanas.split(Pattern.quote(","));  
	    
	    for(int i = 0; i < dias.length; i++){
	    	System.out.println(dias[i]);
	    }
	}
}
