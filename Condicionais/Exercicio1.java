package Condicionais;

import java.util.Scanner;

public class Exercicio1 
{
	public static void main(String[] args)
	{
		//Faça um programa que receba três inteiros e diga qual dels é o maior.
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3;
		int maior = 0;
		
		
		
		System.out.print("Digite um número para A: ");
		num1 = ler.nextInt();
		System.out.print("Digite um número para B: ");
		num2 = ler.nextInt();
		System.out.print("Digite um número par C: ");
		num3 = ler.nextInt();
		
		//caso num1 for maior que todos ele vai entrar aqui
		if(num1 > num2) 
		{
			maior = num1;
		}
		//caso num2 for maior que todos ele vai entrar aqui
		else 
		{
			maior = num2;
		}

		if(maior > num3) 
		{
			System.out.printf ("\n O maior número digitado é %d!", maior);
		} 
		//caso num2 for maior que todos ele vai entrar aqui
		else
		{
			System.out.printf ("\n O maior número digitado é %d!", num3);
		}
		
		
		
		
		}
	}

