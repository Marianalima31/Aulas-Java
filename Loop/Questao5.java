package loop;

import java.util.Scanner;

public class Questao5 

{
	public static void main(String[] args)
	{
		//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		//No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		
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

		  System.out.printf("A somas dos numeros inteiros � %d", soma);
	}
}
