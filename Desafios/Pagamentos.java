package Deseafios;

import java.util.Scanner;

public class Pagamentos 

{
	public static void main (String args[])
	
	{
		Scanner leia = new Scanner(System.in);
		
		char opcaoPagamento; 
		double valorTotal = 0.00, juros = 0.00;
		
	
		System.out.printf("\n TOTAL GERADO R$ %.2f",valorTotal);
		System.out.print("\n === OP??ES PAGEMENTO ====");
	
		System.out.print(" 1 - A VISTA - 10% DESCONTO"
				  + "\n 2 - CART?O  - 1x, SEM DESCONTO" 
				  + "\n 3 - CART?O  - 2x, JUROS DE 10% " 
				  + "\n 4 - CART?O  - 3x, JUROS DE 15% "
				  + "\n"
				  + "SELECIONE A OP??O DESEJADA: ");
		
		opcaoPagamento = (char) leia.nextInt();
		
		if(opcaoPagamento == 1) 
		{
			valorTotal=valorTotal-(valorTotal*0.1);
			System.out.printf("\n Valor a ser pago: R$ %.2f ",valorTotal);
		}
		if(opcaoPagamento == 2) 
		{
			
			System.out.printf("\n Valor a ser pago: R$ %f ",valorTotal);
		}
		if(opcaoPagamento == 3) 
		{
			valorTotal=valorTotal+(valorTotal*0.1);
			juros = valorTotal+(valorTotal*0.1)/2;
			System.out.printf("\n Valor a ser pago: R$ %.2f em 2x de R$ %.2f ",valorTotal,juros);
		}
		if(opcaoPagamento == 4) 
		{
			valorTotal=valorTotal-(valorTotal*0.1);
			juros = valorTotal+(valorTotal*0.1)/3;
			System.out.printf("\n Valor a ser pago: R$ %.2f em 3x de R$ %.2f ",valorTotal,juros);
		}
		else
		{
			System.out.print("Op??o inv?lida, selecione uma op??o de [1-4]:  ");
			opcaoPagamento = (char) leia.nextInt();
		}
		
	}
	
}	
	
	
