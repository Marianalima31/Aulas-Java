package MatrizVetor;

import java.util.Scanner;
import java.util.Random;

public class Questao2 

{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in); 
		
		//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
		//A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
		
		 int [] lancamentos = new int[10];
		 int maiorValor = 0, rodadas =10  ;
		 int somaTotal= 0;
		 int ocorrencias =0	;	 
		 double media =0.00;
		 Random random = new Random(); 
		 
		 for (int i=0; i<rodadas; i++) 
		 {
			 	lancamentos[i] = random.nextInt(6)+1;
			 	System.out.printf(" ", lancamentos[i], "\n");
			 }

				for (int i=0; i<rodadas; i++)
				{ 
					somaTotal += lancamentos[i];

				if(lancamentos[i] >= maiorValor)
				{
					if (lancamentos[i] == maiorValor)
				{	
			 		ocorrencias++;
			 	} 
			 	
					else
			 	{
			 		ocorrencias=1;
			 	} 
			 	
				maiorValor = lancamentos[i];
				
				}
		
			 } 
		media = somaTotal / rodadas;
		
		System.out.printf("\n A soma dos valores � %d e  a m�dia aritm�tica � %.2f", somaTotal ,media);
		System.out.printf("\n Maior valor informado foi %d que aparece %d nos lanc�amentos", maiorValor, ocorrencias);
	}
}
