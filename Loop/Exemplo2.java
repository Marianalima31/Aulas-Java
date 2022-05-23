package Condicionais;

import java.util.Scanner;

public class Exemplo2 
{
	public static void main(String[] args)
	{ 
		Scanner ler = new Scanner(System.in);
		int numero,  x;
		System.out.print("\n Digite o numero:  ");
		numero = ler.nextInt();
				
		x = numero ;

		do 
		{
		x = x -1 ;
		numero = numero + x;
		
		if(numero==0);
		{
			numero = 0;
		}
		
		
	    } 
		while (x>0);
 
	    System.out.println("\n"+numero);
	  
	}
}
