package Condicionais;

import java.util.Scanner;

public class TesteExercicio1 
{
	public static void main(String[] args)
	{
		int num;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		num = ler.nextInt();
		
		if (num < 0 ) 
		{
			System.out.println(" Desculpe, o n�mero digitado � negativo. N�o � possivel continuar");
		 }
		else if (num == 0)
		{
		 		System.out.println("O n�mero digitado � um n�mero neutro ");
		 }

		else if (num >0)
		{
		     	if (num % 2 == 0)
		     		System.out.println ("O n�mero digitado � par!");
		     		else System.out.println("O n�mero digitado � impar!");
		}
			

	}
}
