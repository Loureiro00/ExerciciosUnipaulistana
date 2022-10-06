package Lista2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println(" 5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. "
				+ "A fórmula de conversão é F = (9*C + 160) /5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.");
		System.out.println();
		float c,conv;
		
		System.out.println(" Escreva a temperatudo em Celsius :");
		c=ler.nextFloat();
		
		conv=(9*c+160)/5;
		
		System.out.println(" A temperatura em Fahrenheit é "+conv);
		ler.close();
		
		
		}

	}


