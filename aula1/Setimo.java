package aula1;

import javax.swing.JOptionPane;

public class Setimo {
	public static void main(String[] args) {
		String primeironumero;
		int primeiro;
		String segundonumero;
		int segundo;
		
		primeironumero=JOptionPane.showInputDialog("Digite o primeiro número");
		primeiro=Integer.parseInt(primeironumero);
		segundonumero=JOptionPane.showInputDialog("Digite o segundo número");
		segundo=Integer.parseInt(segundonumero);
		
		int soma=primeiro+segundo;
		
		JOptionPane.showMessageDialog(null, "O resultado da soma dos números: "+ soma,
				"Resultado",JOptionPane.INFORMATION_MESSAGE);
				
	}

}

