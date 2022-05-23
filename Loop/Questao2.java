package loop;

import java.util.Scanner;

public class Questao2 

{
	public static void main(String[] args)
	{
	// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
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
		
		 System.out.printf("\n O número de pares digitados é %d",pares);
		 System.out.printf("\n O número de impares digitados é %d",(10-pares));
	}	
}
