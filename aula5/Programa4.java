//0:46:50
package aula5;

public class Programa4 {
	public static void main(String[] args) {
		String [] professores = new String[5];
		professores[0]="Pedro";
		professores[1]="Fretz";
		professores[2]="Luciano";
		professores[3]="Edith";
		professores[4]="Eduardo";
		
		for (int contador = 0; contador < professores.length; contador++) {
			System.out.print(professores[contador]+ " ");
		}
	}
}
