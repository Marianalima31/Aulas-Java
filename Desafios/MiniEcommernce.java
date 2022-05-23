package Deseafios;

import java.util.Scanner;

public class MiniEcommernce
{
	public static void main (String args[])
	
	{
		Scanner leia = new Scanner(System.in);
		
		String descricaoProduto[] = {"L01,L02,L03,L04"};
		double valorProduto[] = {10.90 , 11.90, 12.90 , 13.50};
		int estoque[] = {10 , 10 , 10 , 10};
		int unidades = 0 , compra = 0;
		
		if (compra> 0 && compra <=10 && estoque[compra-1]>0)
		{
			System.out.printf("\nQuantas unidades do livro", descricaoProduto[compra -1]," deseja comprar? : " );
			unidades= leia.nextInt();
		}
		estoque[compra-1] -= unidades;
		pagamento[compra-1] = (unidades * valorProduto[compra-1]);
		valorTotal += pagamento[compra-1];
		
	}
}
