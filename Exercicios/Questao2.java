package aulas;

import java.util.Scanner;

public class Questao2 
{  
	
	public static void main(String[] args)
{
	// 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e 
   //	mostre-a expressa em anos, meses e dias. 

	int idadePessoa , anos, meses, dias;
	Scanner leitor = new Scanner(System.in);
			
	System.out.println("Digite sua idade em dias: ");
	idadePessoa = leitor.nextInt();
	
	anos = idadePessoa/365;
	meses = (idadePessoa%365)/30;
	dias = (idadePessoa%365)%30;
	
	System.out.println(" Total em anos: " + anos);
	System.out.println(" Total em meses: " + meses);
	System.out.println(" Total em dias: " + dias);

 }
}
