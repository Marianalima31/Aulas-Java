package MatrizVetor;

import java.util.Scanner;

public class Questao1

{
	public static void main(String[] args)
	{
		//1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
		//Encontre após a maior pontuação e a apresente. 
		
		Scanner leia = new Scanner(System.in); 
		
		int[]atv = new int [5];
		int maior = 0;
		int tam = atv.length;
		
		for(int x=0; x<5; x++) 
		{
			System.out.print("informe a pontuação da atividade do aluno:  ");
			atv[x] = leia.nextInt();
			
			if(atv[x]> maior) 
			{
				maior = atv[x];
			}
			
		}
		
		System.out.printf("\n A maior pontuação informada foi %d !!", maior);
	}
}
