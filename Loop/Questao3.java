package loop;

import java.util.Scanner;

public class Questao3 

{
	public static void main(String[] args)
	{
		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		
		Scanner ler = new Scanner(System.in); 
		int idade = 0,idade21=0,idade50=0;
		
		System.out.print("\n Informe a idade -99 para encerrar o programa");
		
		while(idade!=-99)
		 {
			System.out.print("\nInforme a idade:  ");
			idade = ler.nextInt();
			
			if(idade<21) 
			{ 
				idade21++;
			}
			if(idade>50) 
			{ 
				idade50++;
			}
			
		}
			 
		System.out.printf("\n O total de pessoas com menos de 21 anos é de %d ",idade21);
		System.out.printf("\n O total de pessoas com mais  de 50 anos é de %d",idade50);

	}
		
	}

