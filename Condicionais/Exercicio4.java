package Condicionais;

import java.util.Scanner;

public class Exercicio4 
{
	public static void main(String[] args)
	{
		//Faça um programa em que permita a entrada de um numero qualquer e exiba se este número é par ou impar.
		// Se for par exiba também a raiz quadrada do mesmo;
		// Se for impar exiba o número elevado ao quadrado;
		
		Scanner ler = new Scanner(System.in);
		int num, raiz, potencia;
		
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		
		if (num >0)
		{
		     	if (num % 2 == 0) 
		     	{
		     		raiz = (int) (Math.sqrt(num));
		     		System.out.printf ("\n O número digitado é par! e sua raiz quadrada é %d!!", raiz);
		     	}
		     	 else 
		        {
		     		 potencia = (int) (Math.pow(num,2));
		     		 System.out.printf("\n O número digitado é impar! e o número elevado ao quadrado é %d",potencia);
		        }
		}
		else if (num == 0)
		{
		 		System.out.println("\n O número digitado é um número neutro ");
		 }
	}

}
