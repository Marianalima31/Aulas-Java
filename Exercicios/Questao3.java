package aulas;

import java.util.Scanner;

public class Questao3 
{
	public static void main(String[] args)
	{ 
		
		int horas, minutos, segundos,seg;
		Scanner leitor = new Scanner(System.in);
			
		System.out.println("Digite a duração do evento em segundo: ");
		segundos = leitor.nextInt();
	
		horas = segundos/3600;
		minutos = ((segundos%3600)/60);
		seg = ((segundos%3600)%60);
	
		System.out.println("A duração do evento foi de  " + horas + "  horas, " + minutos+"  minutos e "+seg + " segundos");
	}
}
