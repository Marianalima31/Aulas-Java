package Condicionais;

import java.util.Scanner;

public class Exercio2 
{
	public static void main(String[] args)
	{
		//Faça um programa que entre com três e coloque em ordem crescente.
		
		
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3;
		int maior = 0,menor;
		
		System.out.print("Digite um número para A: ");
		num1 = ler.nextInt();
		System.out.print("Digite um número para B: ");
		num2 = ler.nextInt();
		System.out.print("Digite um número par C: ");
		num3 = ler.nextInt();
		
		if(num1 <= num2) 
		{
			
		    if(num2 < num3) 
		    {
		    	System.out.println("A ordem crescente é:" +num1+" "+num2+" " +num3);
		    }
		    else if(num1 <= num3)
		    {
		    	System.out.println("A ordem crescente é:" +num1+" "+num3+" " +num2);
		    }
		    else 
		    {
		    	System.out.println("A ordem crescente é:" +num3+" "+num1+" " +num2);
		    }
		}
		else if(num2 < num3)
		{
			if(num1 < num3) 
		    {
		    	System.out.println("A ordem crescente é:" +num2+" "+num1+" " +num3);
		    }
			else
			{
			    System.out.println("A ordem crescente é:" +num2+" "+num3+" " +num1);
			   
			}
		}
		else 
		{
		    	System.out.print("\n A ordem crescente é: " +num3+" , "+num2+" ," +num1);
		   
		}
	}
}
