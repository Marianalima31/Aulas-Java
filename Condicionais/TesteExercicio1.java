package Condicionais;

import java.util.Scanner;

public class TesteExercicio1 
{
	public static void main(String[] args)
	{
		int num;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		
		if (num < 0 ) 
		{
			System.out.println(" Desculpe, o número digitado é negativo. Não é possivel continuar");
		 }
		else if (num == 0)
		{
		 		System.out.println("O número digitado é um número neutro ");
		 }

		else if (num >0)
		{
		     	if (num % 2 == 0)
		     		System.out.println ("O número digitado é par!");
		     		else System.out.println("O número digitado é impar!");
		}
			

	}
}
