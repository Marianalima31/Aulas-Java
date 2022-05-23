package aulas;

import java.util.Scanner;

public class Questao6 
{
	public static void main(String[] args)
	{
		int a, b, c, d, r, s;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor a ");
		a = leitor.nextInt();
		System.out.println("Informe o valor b ");
		b = leitor.nextInt();
		System.out.println("Informe o valor c ");
		c = leitor.nextInt();
	
		r = (int) Math.pow((a+b),2);
		s = (int) Math.pow((b+c),2);
		
		d = ((r+s)/2);
		
		System.out.println(" O resultado da expressâo é: " + d);
	}

}
