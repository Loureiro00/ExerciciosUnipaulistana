package Lista1;

import java.util.Scanner;

public class Exercicío03 {

	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		int n1,n2,soma;
		System.out.println(" 3) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a soma dos valores.");
		System.out.println();	
		System.out.println("Escreva dois numeros : ");
			n1=ler.nextInt();
			System.out.println();
			n2=ler.nextInt();
			
			soma=n1+n2;
			
			System.out.println(" A soma dos dois numeros é de : "+soma);
			
			ler.close();
	
	
	
	
	}

}
