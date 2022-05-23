package Condicionais;

import java.util.Scanner;

public class Exercicio3 
{
	public static void main(String[] args)
	{
		//Faça um programa que receba a idade de uma pessoa e mostre na saida em qual categoria ela se encontra.
		// 10-14 Infantil 15-17 juvenil 18- 25 adulto
		
		Scanner ler = new Scanner(System.in);
		int idadePessoa;
		
		System.out.print("Informe a sua idade: ");
		idadePessoa = ler.nextInt();
		

		if (idadePessoa>=10 && idadePessoa<=14)
				{
					System.out.print("\n A sua idade está categorizada como categoria infantil");	
				}
		else if (idadePessoa>=15 && idadePessoa<=17) 
				{
					System.out.print("\n A sua idade está categorizada como categoria juvenil");		
				}
		else if (idadePessoa>=18 && idadePessoa<=25) 
				{
				System.out.print("\n A sua idade está categorizada como categoria adulto");	
				}
	}
}
