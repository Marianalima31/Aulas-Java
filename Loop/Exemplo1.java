package loop;

import java.util.Scanner;

public class Exemplo1 

{
	public static void main(String[]args)
	{
		Scanner ler = new Scanner(System.in);
		final int habitantes = 3;
		double salario, mediaSalario = 0.00 , mediaFilhos = 0.00, percentualSalario100=0.00;
		double maiorSalario=0.00, totalSalarios = 0.00;
		int numFilhos = 0;
		double totalFilhos = 0.00;
		double contadorValor100 = 0.00;
		
		for (int x= 1; x<= habitantes; x++)
		{
			System.out.print("\n Informe o salário do habitante:  ");
			salario = ler.nextInt();
		     
		     System.out.print("\n Informe o número de filhos deste habitante:  ");
		     numFilhos = ler.nextInt();

			totalSalarios = totalSalarios + salario;
			totalFilhos += numFilhos;
			
			if (salario > maiorSalario) 
			{
				maiorSalario = salario;
			}
			if (salario <=100)
			{
			   contadorValor100++;
				
			}
		}	
				mediaSalario = totalSalarios / habitantes;
				mediaFilhos += totalFilhos / habitantes;
				percentualSalario100 = (contadorValor100 / habitantes)*100.00;
		
			System.out.printf("\n Media salarial  é de R$ %.2f", mediaSalario, "\n");
			System.out.printf("\n Media de filhos é %.2f ", mediaFilhos, "\n");
			System.out.printf("\n O maior salario informado foi R$ %.2f !! ", maiorSalario, "\n");
			System.out.printf("\n O numero pessoas que ganham até R$ 100 =  %,2f , Sendo um percentutal total de: %.2f %%", contadorValor100, percentualSalario100);
			System.out.print("\n Obrigado pela ajuda! Fim de programa!!");
	
	}
}
