package aulas;

import java.util.Scanner;

public class Questao4 
{
	public static void main(String[] args)
	{
		float nota1, nota2, nota3, media;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a nota 1:");
		nota1 = leitor.nextInt();
		System.out.println("Informe a nota 2: ");
		nota2 = leitor.nextInt();
		System.out.println("Informe a nota 3: ");
		nota3 = leitor.nextInt();
		
		media = ((nota1*2)+(nota2*3)+(nota3*3))/10;
		System.out.println(" A média ponderada é " + media);
	}

}
