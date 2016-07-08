package aula6;

import java.util.Scanner;

public class Convert {
	public void converterTemperaturas(){
		Scanner input = new Scanner(System.in);
		int escolha;
		
		do {
			System.out.println("1. Farenheit to Celsius");
			System.out.println("2. Celsius to Farenheit");
			System.out.println("3. Exit");
			escolha = input.nextInt();
			
			if(escolha!=3){
				System.out.println("Enter Temperature: ");
				int temperatura = input.nextInt();
				switch (escolha) {
				case 1:
					System.out.printf("%d Farenheit equivale a %d Celsius\n", temperatura, celsius(temperatura));
					break;
				case 2:
					System.out.printf("%d Celsius equivale a %d Farenheit\n", temperatura, farenheit(temperatura));
					break;

				}
			}
		} while (escolha!=3);
	}
	
	public int celsius(int farenheitTemperature){
		return((int) (5.0/9.0*(farenheitTemperature-32)));
	}
	public int farenheit(int celsiusTemperature){
		return ((int) (9.0/5.0 * (celsiusTemperature * 32)));
	}
}
