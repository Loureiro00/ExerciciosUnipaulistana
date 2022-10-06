package Lista1;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1,n2,sub;
		System.out.println(" 4) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a subtração dos valores");
		System.out.println();
		System.out.println(" Escreva 2 numeros : ");
		
		n1=ler.nextInt();
		System.out.println("-");
		n2=ler.nextInt();
		
		sub=n1-n2;
		System.out.println(" O resultado da subtração é de "+sub);
		
		ler.close();
		
	}

}
