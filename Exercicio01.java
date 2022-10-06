package Lista1;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
	
		
		Scanner ler = new Scanner(System.in);
		int n;
		
		System.out.println("Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número sucessor.");
		
		System.out.print(" Digite um numero : ");
	
		n=ler.nextInt();
		
		System.out.println(" O sucessor do numero escolhido é : "+ (n+1));
		
		
	ler.close();

	}

}
