package loop;

import java.util.Scanner;

public class Questao6 

{
	public static void main(String[] args)
	{
		//Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. 
		//Para sair digitar 0(zero).(DO...WHILE)
		
		Scanner ler = new Scanner(System.in); 
		int num;
        int soma=0;
		int count =0;

		  do
		  {
			  System.out.print("Digite um numero inteiro: ");
		      num=ler.nextInt();
		      
		      if(num!=0 & num %3==0)
		      {
		          count+=1;
		          soma += num;
		      }
		  }
		  
		  while(num > 0);

		  double media = (double)soma/count;

		  System.out.printf("\n A média dos numeros é  %3.2f", media);
		  
	}
}
