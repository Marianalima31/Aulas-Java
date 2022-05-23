package Deseafios;

import java.util.Scanner;

public class carrinhoDeCompra 
{	
	public static void main (String args[])

	
	{
		Scanner leia = new Scanner(System.in);
		
		String descricaoProduto[] = {"L01,L02,L03,L04"};
		double valorProduto[] = {10.90 , 11.90, 12.90 , 13.50};
		int estoque[] = {10 , 10 , 10 , 10};
		int unidades = 0 , compra = 0, tam = 0; 
		char opcaoPagamento; 
		double valorTotal = 0.00, juros = 0.00;
		

		for(int i=0; i<tam ; i++)
		{
			System.out.printf("\n",(i+1),"\t",estoque[i],"\t\t",descricaoProduto[i]);
			
			if(i==(tam-1))
			{
				System.out.print("\n");
			}
		}
		
	}	

}
