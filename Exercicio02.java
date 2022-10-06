package Lista1;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	

		int n;
		Scanner ler = new Scanner(System.in);
		System.out.println(" Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número antecessor.");
		System.out.println();
		System.out.print
		(" Digite um numero : ");
		n=ler.nextInt();
		
		System.out.println(" O antecesso é :  "+(n-1));
		
		ler.close();
		
	}

}
