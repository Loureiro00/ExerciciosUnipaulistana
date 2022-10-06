package Lista2;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		System.out.println(" Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto\r\n"
				+ "(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da\r\n"
				+ "distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS=DISTÂNCIA/12. Ao final, o programa deve apresentar os valores da velocidade\r\n"
				+ "média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distância percorrida (DISTÂNCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.\r\n"
				+ "");
				System.out.println();
				
		float tempo,velocidade,distancia,litrosusados;
		
			System.out.println(" Digite o tempo de viagem em horas : ");
			tempo=ler.nextFloat();
			System.out.println(" Digite a velocidade média durante a viagem : ");
			velocidade=ler.nextFloat();
			
			distancia=tempo*velocidade;
			litrosusados=distancia/12;
			
			
			System.out.println(" A Velocidade média da viagem é de "+velocidade+" km/h");
			System.out.println(" O tempo gasto na viagem foi de : "+tempo+" /Hrs");
			System.out.println(" A distancia percorrida foi de : "+distancia+" /km");
			System.out.println(" O consumo total de foi "+litrosusados+" /lt");
			
			ler.close();
			
		
		

	}


	}


