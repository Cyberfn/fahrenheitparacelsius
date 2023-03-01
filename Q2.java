package Questoes;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o a temperatura em Farenheit:");
		 double F = entrada.nextDouble();
		 
		 double C = (5 * (F-32) / 9);
		 
		 System.out.println("A temperatura em Celsius é " + C + "°");
		
	}

}
