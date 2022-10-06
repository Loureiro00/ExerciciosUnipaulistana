package Lista2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner ler = new Scanner(System.in);
		System.out.println("10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B,"
		+ " e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.");
		System.out.println();
		
		int A,B,aux;
				
			System.out.println(" Digite o valor de A : ");
			A=ler.nextInt();
			System.out.println(" Digite o valor de B : ");
			B=ler.nextInt();
			aux=A;
			A=B;
			B=aux;
					
			System.out.println(" Os valores trocados são : ");
			System.out.println(A);
			System.out.println(B);
			
			ler.close();
		}

	}
	
	
	

