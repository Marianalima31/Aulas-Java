package Condicionais;

import java.util.Scanner;

public class Exercicio4 
{
	public static void main(String[] args)
	{
		//Fa�a um programa em que permita a entrada de um numero qualquer e exiba se este n�mero � par ou impar.
		// Se for par exiba tamb�m a raiz quadrada do mesmo;
		// Se for impar exiba o n�mero elevado ao quadrado;
		
		Scanner ler = new Scanner(System.in);
		int num, raiz, potencia;
		
		System.out.print("Digite um n�mero: ");
		num = ler.nextInt();
		
		if (num >0)
		{
		     	if (num % 2 == 0) 
		     	{
		     		raiz = (int) (Math.sqrt(num));
		     		System.out.printf ("\n O n�mero digitado � par! e sua raiz quadrada � %d!!", raiz);
		     	}
		     	 else 
		        {
		     		 potencia = (int) (Math.pow(num,2));
		     		 System.out.printf("\n O n�mero digitado � impar! e o n�mero elevado ao quadrado � %d",potencia);
		        }
		}
		else if (num == 0)
		{
		 		System.out.println("\n O n�mero digitado � um n�mero neutro ");
		 }
	}

}
