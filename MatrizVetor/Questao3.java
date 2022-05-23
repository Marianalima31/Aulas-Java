package MatrizVetor;

import java.util.Scanner;


public class Questao3 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in); 
		int[][] N1 = new int [4][6];
		int[][] N2 = new int [4][6];
		int[][] M1 = new int [4][6];
		int[][] M2 = new int [4][6];
		
		
		for(int linha=0;linha<4;linha++)
		{
			for(int coluna=0;coluna<6;coluna++) 
			{ 
				System.out.printf("\n Insira o elemento [%d][%d]: ",linha+1,coluna+1);
				N1[linha][coluna]=leia.nextInt();
			}
		}
		
		for(int linha=0;linha<4;linha++) 
		{
			for(int coluna=0;coluna<6;coluna++) 
			{ 
				System.out.printf("\t %d \t",N1[linha][coluna]);
			}
			
		}
		
		System.out.println();
		for(int linha=0;linha<4;linha++)
		{
			for(int coluna=0;coluna<6;coluna++) 
			{ 
				System.out.printf("\n Insira o elemento [%d][%d]: ",linha+1,coluna+1);
				N2[linha][coluna]=leia.nextInt();
			}
		}
		
		for(int linha=0;linha<4;linha++) 
		{
			for(int coluna=0;coluna<6;coluna++) 
			{ 
				System.out.printf("\t %d \t",N2[linha][coluna]);
			}
			
		}
		for(int linha=0;linha<4;linha++)
		{
			for(int coluna=0;coluna<6;coluna++) 
			{ 
				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna];
				System.out.printf("%d",M1[linha][coluna]);
				
			}
		}
		for(int linha=0;linha<4;linha++)
		{
			for(int coluna=0;coluna<6;coluna++) 
			{ 
				M1[linha][coluna]=N1[linha][coluna]-N2[linha][coluna];
				System.out.printf("%d",M2[linha][coluna]);
				
			}
		}
		
	}
}
