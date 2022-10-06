package Lista2;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		System.out.println(" 7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: "
				+ "Volume = π*Raio^2*Altura");
		float Raio,altura;
		double volume;
		 
		System.out.println(" Digite o raio da lata : ");
		Raio= ler.nextFloat();
		
		System.out.println(" Digite a altura da lata : ");
		altura=ler.nextFloat();
		
		volume= 3.14*Raio*Raio*altura;
		
		System.out.println(" O valor do volume é : "+volume);
		
		ler.close();
		
	
		
	}


	}


