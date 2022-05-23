package MatrizVetor;

import java.util.Scanner;

public class Exemplo1 

{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in); 
		
		String [] times = {"CORITHIANS","PALMEIRAS","SANTOS","SPFC"};
		int pontos[] = new int [4];
		char resposta;

				
		for (int x = 0; x<4; x++)
		{
			 System.out.print("Rodada"+(x+1));
			 
			 for (int y = 0; y<4; y++)
				{
				 System.out.printf(times[y]," G-ganhou P-perdeu ou E-empatou [G/P/E]: ");
				 resposta=(char) leia.nextInt();
					
					if (resposta == 'G')
					{
						pontos[y] = pontos[y]+3;
					}
					else if (resposta =='E')
					{
						pontos[y] = pontos[y]+1;
					}
					else if (resposta =='P')
					{
						pontos[y]= pontos[y]+0;
					}
				}
			 	System.out.print("\n");
				
		}	 
		
		System.out.print("\n");
		for (int z = 0; z< 4; z++)
		{
			 System.out.printf(times[z]," finalizou com ",pontos[z]," pontos.\n");	
		}	 
	}
}
