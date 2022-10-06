package Lista2;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner(System.in);
		System.out.println(" 6) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius."
				+ " A fórmula de conversão é C=(F-32) *(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. ");
		float f,c,form;
		
		System.out.println(" escreva o valor em Fahrenheit : ");
		f=ler.nextFloat();
		
		c=(f-32);
		form=c*5/9;
		
		System.out.println(" o valor em Celcius é de : "+form+"°C");
		
		ler.close();

	}

}
