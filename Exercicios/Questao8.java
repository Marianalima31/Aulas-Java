package aulas;

import java.util.Scanner;

public class Questao8
{
	public static void main(String[] args)
	{
		float vCustoFabrica, vValorDistribuidor, vValorImposto,
		  vCustoConsumidor;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor de custo de fábrica: ");
		vCustoFabrica = leitor.nextInt();
		
		vValorDistribuidor = (float) (vCustoFabrica * 0.28);
				 
		vValorImposto = (float) (vCustoFabrica * 0.45);
				 
		vCustoConsumidor = vCustoFabrica + vValorDistribuidor + vValorImposto;
		
		System.out.println("O custo ao consumidor é: " + vCustoConsumidor);
	}
}
