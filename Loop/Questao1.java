package loop;

import java.util.Scanner;

public class Questao1 

{
	public static void main(String[] args)
	{
		//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
		
		Scanner ler = new Scanner(System.in);
		int num=1000;
		
		for (num=1000;num<2000;num++) 
		{
			if(num%11 ==5) {
				
				System.out.println("\n"+ num);
			}
		}
		
		
	}
	
}
