package loop;

import java.util.Scanner;

public class Questao2 

{
	public static void main(String[] args)
	{
	// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Scanner ler = new Scanner(System.in);
		int numero, impares,pares = 0;
		
		
		for(int x=1;x<=10;x++) 
		{
			System.out.print("\n Digite o numero:  ");
			numero = ler.nextInt();
			
			 	
			 if (numero%2 == 0);
				{
				 		pares=pares+1;
				 }
		}
		
		 System.out.printf("\n O n�mero de pares digitados � %d",pares);
		 System.out.printf("\n O n�mero de impares digitados � %d",(10-pares));
	}	
}
