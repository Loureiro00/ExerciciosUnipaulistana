package Lista2;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			Scanner ler  = new Scanner(System.in);
			System.out.println(" 9) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula : "
					+ "PRESTACAO=VALOR+(VALOR*TAXA/100) *TEMPO).");
			System.out.println();
			float tempo,valor,prestação,taxa;
			
			System.out.println(" Escreva o valor da Prestação : ");
			valor=ler.nextFloat();
			System.out.println(" Escreva o valor da taxa : ");
			taxa=ler.nextFloat();
			System.out.println(" Escreva o tempo em dias que está em aberto : ");
			tempo=ler.nextFloat();
			
			prestação=valor+(valor*taxa/100)*tempo;
			
			System.out.println("O valor em aberto é de :"+ "R$ : " +prestação);
			
			ler.close();
			

		}

	
	}


