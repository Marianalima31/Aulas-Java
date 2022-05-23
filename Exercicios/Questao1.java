package aulas;

import java.util.Scanner;

public class Questao1 
{
	public static void main(String[] args)
	{
		int anos, meses, dias;
		int idadeEmDias;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos: ");
		anos = ler.nextInt();
		System.out.println("Digite sua idade em meses: ");
		meses = ler.nextInt();
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		idadeEmDias = anos * 365 + meses * 30 + dias;
		System.out.println(" A sua idade em dias: " + idadeEmDias);
		
	}
}
