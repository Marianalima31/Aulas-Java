package loop;

import java.util.Scanner;

public class Questao5 

{
	public static void main(String[] args)
	{
		//Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		//No final, mostre a soma dos números digitados.(DO...WHILE)
		
		Scanner ler = new Scanner(System.in); 
		int num;
        int soma=0;
		int count =0;

		  do
		  {
			  System.out.print("Digite um numero inteiro: ");
		      num=ler.nextInt();
		      
		      if(num!=0)
		      {
		          count+=1;
		          soma += num;
		      }
		  }
		  
		  while(num > 0);

		  System.out.printf("A somas dos numeros inteiros é %d", soma);
	}
}
