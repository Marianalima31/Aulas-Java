package MatrizVetor;

import java.util.Random;
import java.util.Scanner;


public class Questao4 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in); 
		
		  final int TAMANHO = 4;
		  int [][] matriz = new int[TAMANHO][TAMANHO];
		  int soma =0;
		  Random random = new Random();
				 
				 for (int linha = 0; linha<TAMANHO; linha++)
				{
					for(int coluna = 0; coluna < TAMANHO; coluna++)
					{
				 		matriz[linha][coluna] = random.nextInt(9)+1;
				 		if (linha == coluna)
						{
							soma += matriz[linha][coluna];
						}
				 		System.out.println((matriz[linha][coluna]));
					} 
					System.out.println();
				}	

				 System.out.printf("Somatorio da diagonal principal é %d ",soma);
	}
}
